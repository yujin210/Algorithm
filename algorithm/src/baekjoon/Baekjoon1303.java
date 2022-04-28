package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1303 {
	static int N;
	static int M;
	static char[][] battleField;
	static boolean[][] visited;
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {-1, 0, 1, 0};
	static int enemy;
	static int our;
	static int[] power = new int[2];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		battleField = new char[M][N];
		visited = new boolean[M][N];
		
		for(int i = 0; i < M; i++) {
			String temp = br.readLine();
			for(int j = 0; j < N; j++) {
				battleField[i][j] = temp.charAt(j); 
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(!visited[i][j]) {
					dfs(i, j);
					power[0] += our * our;
					power[1] += enemy * enemy;
					our = 0;
					enemy = 0;
				}
			}
		}
		
		System.out.println(power[0] + " " + power[1]);
	}
	
	static void dfs(int x, int y) {
		visited[x][y] = true;
		
		if(battleField[x][y] == 'W')
			our++;
		else 
			enemy++;
		
		for(int i = 0; i < 4; i++) {
			 int row = x + dx[i];
			 int col = y + dy[i];
			 
			 if(row >= 0 && row < M && col >= 0 && col < N) {
				 if(!visited[row][col] && battleField[x][y] == battleField[row][col])
					 dfs(row, col);
			 }
		}
	}
}