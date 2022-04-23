package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2468 {
	static int n; // 지역의 크기 
	static int[][] map; // 지도 
	static boolean[][] visited; // 방문 이력 
	static int maxOfSafetyZone; // 최대 안전 영역의 수 
	static int maxOfHeight; //  지역의 최대 높이 
	static int[] row = {0, 0, -1, 1}; // 상하좌우 인접한지 확인하기 위한 좌표 
	static int[] col = {-1, 1, 0, 0}; // 상하좌우 인접한지 확인하기 위한 좌표 
	
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n]; // 지도 초기화 
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); // 각 행을 입력 받기 위함 
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken()); // 각 영역의 높이 정보 입력 
				
				if(maxOfHeight < map[i][j]) // 현재까지 입력 중 가장 높은 높이 저장 
					maxOfHeight = map[i][j];
			}
		}
		
		// 강수량 고려하여 반복 (비가 오지 않을 때 ~ 가장 높은 지역의 높이만큼 내렸을 때) 
		for(int height = 0; height <= maxOfHeight; height++) {
			visited = new boolean[n][n]; // 방문 이력 초기화 
			int countOfSafetyZone = 0; // 안전 영역의 수 
			
			for(int i = 0; i < n; i++) { // 지도 전체 탐색 
				for(int j = 0; j < n; j++) {
					if(!visited[i][j] && map[i][j] > height) { // 해당 지역을 방문한 적이 없고, 강수량보다 고지대에 있는 경우 
						countOfSafetyZone++; // 안전 영역의 수 증가 
						dfs(i, j, height);
					}
				}
			}
			
			if(maxOfSafetyZone < countOfSafetyZone) // 최대 안전 영역의 수 갱신 
				maxOfSafetyZone = countOfSafetyZone;
			
		}
		
		System.out.println(maxOfSafetyZone); // 최대 안전 영역의 수 출력 
	}

 	static void dfs(int i, int j, int height) {
 		visited[i][j] = true; // 방문 처리 
 		
 		for(int a = 0; a < 4; a++) { // 인접 영역 확인 
 			int r = i + row[a];
 			int c = j + col[a];
 			
 			if(r>=0 && r<=n-1 && c>=0 && c<=n-1) { // 지도의 범위를 벗어나지 않도록 관리 
 				if(!visited[r][c] && map[r][c] > height) { // 해당 지역 방문한 적 없으며 강수량보다 고지대에 있는 경우 
 					dfs(r, c, height); // 탐색 (이때는 인접해 있으므로 안전 영역의 수 증가시키지 않음) 
 				}
 			}
 		}
 	}
}