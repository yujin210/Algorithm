package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon14716 {
	static int M;
	static int N;
	static int[][] banner;
	static boolean[][] visited;
	static int[] dx = {-1, 0, 1, 0, 1, 1, -1, -1};
	static int[] dy = {0, -1, 0, 1, 1, -1, 1, -1};;
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		banner = new int[M][N];
		visited = new boolean[M][N];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				banner[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(!visited[i][j] && banner[i][j] == 1) {
					dfs(i, j);
					count++;
				}
			}
		}
		
		System.out.print(count);
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i = 0; i < 8; i++) {
			int row = x + dx[i];
			int col = y + dy[i];
			
			if(row >= 0 && row < M && col >= 0 && col < N) {
				if(!visited[row][col] && banner[row][col] == 1)
					dfs(row, col);
			}
		}
	}
}