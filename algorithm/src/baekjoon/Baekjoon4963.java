package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon4963 {
	static int w; // 지도의 너비 
	static int h; // 지도의 높이 
	static int[][] map; //  지도 
	static boolean[][]visited; // 방문이력 관리 
	static int[] row = {0, 0, -1, 1, -1, -1, 1, 1}; // 상하좌우 및 대각선 이동 좌표
	static int[] col = {-1, 1, 0, 0, -1, 1, -1, 1}; // 상하좌우 및 대각선 이동 좌표 
	static int landCount = 0; // 섬의 개수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		while(w != 0 && h != 0) { // 지도의 너비와 높이가 모두 0이면 반복 종료 
			map = new int[h][w]; // 지도 초기화 
			visited = new boolean[h][w]; // 방문이력 초기화 
			
			for(int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0; i < h; i++) { // 지도 전체 탐색
				for(int j = 0; j < w; j++) {
					if(!visited[i][j] && map[i][j] == 1) { // 방문 기록이 없고, 섬인 경우에 탐색 시작 
						landCount++; // 섬의 수 증가
						dfs(i, j); 
					}
				}
			}
			
			System.out.println(landCount); // 지도 탐색이 끝나면 섬의 개수 출력 
			
			// 새로운 지도(테스트 케이스)의 너비와 높이 입력 
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			landCount = 0; // 섬의 개수 초기화 
		}
	}
	
	static void dfs(int i, int j) {
		visited[i][j] = true; // 방문 처리 
		
		for(int a = 0; a < 8; a++) { // 좌표 위치 변경 (상하좌우, 대각선)
			int r = i+row[a];
			int c = j+col[a];
			
			if(r>=0 && r<=h-1 && c>=0 && c<=w-1) { // 지도의 범위를 넘어가지 않도록 조건문 사용 
				if(!visited[r][c] && map[r][c] == 1) { // 방문 이력이 없고, 섬인 경우 탐색 
					dfs(r, c);
				}
			}
		}
	}
}