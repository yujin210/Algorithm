package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3187 {
	static int R; // 영역의 세로 길이 
	static int C; // 영역의 가로 길이 
	static char[][] farm; // 양과 늑대가 있는 공간 
	static boolean[][] visited; // 방문 이력 
	static int[] row = {0, 0, -1, 1}; // 상하좌우 이동시 변하는 좌표 
	static int[] col = {-1, 1, 0, 0}; // 상하좌우 이동시 변하는 좌표 
	static int sheep; // 양의 수 
	static int wolf;  // 늑대의 수 
	static int[] alive = new int[2]; // 살아남게 되는 양과 늑대의 수 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		farm = new char[R][C];
		visited = new boolean[R][C];
		
		for(int i = 0; i < R; i++) {
			String temp = br.readLine();
			for(int j = 0; j < C; j++) {
				farm[i][j] = temp.charAt(j);
			}
		}
		
		for(int i = 0; i < R; i++) { // 농장의 모든 지역 탐색 
			for(int j = 0; j < C; j++) {
				if(!visited[i][j] && farm[i][j] != '#') { // 방문한 적이 없으면서 울타리가 아닌 곳 탐색 
					dfs(i, j);
					if(sheep > wolf) // 늑대보다 양이 더 많은 경우 
						alive[0] += sheep; // 늑대는 다 잡아먹히므로 살아남는 양의 수 증가 
					else // 그 외의 경우에는 
						alive[1] += wolf; // 양은 다 잡아 먹히므로 살아남는 늑대의 수 증가 
					sheep = 0; // 양의 수 초기화 
					wolf = 0;  // 늑대의 수 초기화 
				}
			}
		}
		
		System.out.println(alive[0] + " " + alive[1]); // 결과 출력 
	}
	
	static void dfs(int i, int j) {
		visited[i][j] = true; // 방문 처리 
		
		if(farm[i][j] == 'v') // 탐색 위치에 늑대가 발견될 경우 
			wolf++; // 늑대 수 증가 
		else if (farm[i][j] == 'k') // 탐색 위치에 양이 발견될 경우 
			sheep++; // 양의 수 증가 
		
		for(int a = 0; a < 4; a++) { // 상하좌우 이동하면서 확인 
			int r = i + row[a];
			int c = j + col[a];
			
			if(r >= 0 && r < R && c >= 0 && c < C) { // 농장의 크기를 벗어나지 않도록 관리 
				if(!visited[r][c] && farm[i][j] != '#') // 방문한 적이 없으면서 울타리가 아닌 경우 탐색 
					dfs(r, c);
			}
		}
	}

}