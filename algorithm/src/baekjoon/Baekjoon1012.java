package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1012 {
	static int width; // 배추밭의 가로길이 
	static int height; // 배추밭의 세로길이 
	static int location; // 배추가 심어져있는 위치의 개수 
	static int[][] map; // 배추밭 지도 
	static boolean[][] visited; // 방문 이력 
	static int[] row = {0, 0, -1, 1}; // 상하좌우 이동 좌표 
	static int[] col = {-1, 1, 0, 0}; // 상하좌우 이동 좌표 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) { // 테스트케이스의 수 만큼 반복 
			int need = 0; // 필요한 배추흰지렁이의 마리 수 
			StringTokenizer st = new StringTokenizer(br.readLine());
			width = Integer.parseInt(st.nextToken());
			height = Integer.parseInt(st.nextToken());
			location = Integer.parseInt(st.nextToken());
			
			map = new int[width][height];
			visited = new boolean[width][height];
			
			for(int j = 0; j < location; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken()); // 배추가 심어진 위치의 x좌표 
				int y = Integer.parseInt(st.nextToken()); // 배추가 심어진 위치의 y좌표 
				
				map[x][y] = 1; // 배추가 있는 곳은 값을 1로 변경 
			}
			
			for(int a = 0; a < width; a++) { // 배추밭 전체 탐색 
				for(int b = 0; b < height; b++) {
					if(!visited[a][b] && map[a][b] == 1) { // 방문한 적이 없고, 배추가 있으면 탐색 
						need++; // 필요한 배추흰지렁이 수 증가 
						dfs(a, b);
					}
				}
			}
			
			System.out.println(need);
		}
	}
	
	static void dfs(int a, int b) {
		visited[a][b] = true; // 방문 처리 
		
		for(int i = 0; i < 4; i++) { // 상하좌우 이동하며 인접하게 존재하는 배추 파악 
			int r = a + row[i]; 
			int c = b + col[i];
			
			if(r >= 0 && r <= width-1 && c >= 0 && c <= height-1) { // 지도의 범위를 넘어가지 않도록 관리 
				if(!visited[r][c] && map[r][c] == 1) { // 방문한 적이 없고, 배추가 존재하면 탐색 
					dfs(r, c);
				}
			}
		}
	}
}