package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon2667 {
	static int n;	// 지도의 크기 
	static int[][] map;	// 지도 
 	static boolean[][] visited;	// 방문 이력 관리 
 	static int[] row = {0, 0, -1, 1};	// 상하좌우 이동하기 위한 좌표 
 	static int[] col = {-1, 1, 0, 0};	// 상하좌우 이동하기 위한 좌표 
 	static int home = 0;	// 집의 수 
 	static ArrayList<Integer> arrlist = new ArrayList<>(); // 각 단지 내 집의 수 
 	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map = new int[n+1][n+1];
		visited = new boolean[n+1][n+1];
		
		for(int i = 0; i < n; i++) {
			String temp = br.readLine();
			for(int j = 0; j < n; j++) {
				map[i][j] = temp.charAt(j)-'0';
			}
		}
		
		for(int i = 0; i < n; i++) {	// 지도 전체 탐색 
			for(int j = 0; j < n; j++) {
				if(!visited[i][j] && map[i][j] == 1) { // 현재 방문이력이 없고 집이 있으면(값이 1) 주변 탐색   
					home = 1;	// 단지가 시작하므로 변수 초기화 (현재 위치도 집이 존재하므로 1부터 시작) 
					dfs(i, j);
					arrlist.add(home); // 탐색 결과 얻은 단지 내 집의 수 저장  
				}
			}
		}
		
		System.out.println(arrlist.size()); // 총 단지 수 
		Collections.sort(arrlist);	// 각 단지 내 집의 수 오름차순 정렬 
		for(int i : arrlist) {
			System.out.println(i);
		}
	}	
	
	static void dfs(int i, int j) {
		visited[i][j] = true; // 방문처리 
		
		for(int a = 0; a < 4; a++) { // 상하좌우 이동하며 주변 탐색 
			int r = i+row[a];
			int c = j+col[a];
			
			if(r >= 0 && r <= n-1 && c >= 0 && c <= n-1) {	// 지도의 범위를 벗어나지 않도록 조건 걸어주기 
				if(!visited[r][c] && map[r][c] == 1) {	// 방문 이력이 없고, 집이 존재한다면 (값이 1) 
					dfs(r, c);	// 해당 지점부터 다시 주변 탐색 
					home++;	// 단지 내에 존재하는 집의 수 증가 
				}
				
			}
			
		}
	}
}