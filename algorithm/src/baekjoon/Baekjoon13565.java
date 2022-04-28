package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon13565 {
	static int N;
	static int M;
	static int[][] board;
	static boolean[][] visited;
	static int dx[] = {0, -1, 0, 1};
	static int dy[] = {1, 0, -1, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		board = new int[M][N];
		visited = new boolean[M][N];
		
		for(int i = 0; i < M; i++) {
			String temp = br.readLine();
			for(int j = 0; j < N; j++) {
				board[i][j] = temp.charAt(j)-'0';
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(!visited[0][i] && board[0][i] == 0)
				dfs(0, i);
		}
		
		for(int i = 0; i < N; i++) {
			if(board[M-1][i] == 2) {
				System.out.println("YES");
				break;
			}
			
			if(i == N-1 && board[M-1][i] != 2)
				System.out.println("NO");
		}
	}
	
	static void dfs(int x, int y) {
		visited[x][y] = true;
		board[x][y] = 2;
				
		for(int i = 0; i < 4; i++) {
			int row = x + dx[i];
			int col = y + dy[i];
			
			if(row >= 0 && row < M && col >= 0 && col < N) {
				if(!visited[row][col] && board[row][col] == 0) 
					dfs(row, col);
			}
		}
	}
}