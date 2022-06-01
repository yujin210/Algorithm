package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon21736 {
	static boolean[][] visited;
	static char[][] campus;
	static int n;
	static int m;
	static int[] dx = {-1, 0, 0, 1};
	static int[] dy = {0, -1, 1, 0};
	static int person = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		campus = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String temp = br.readLine();
			for(int j = 0; j < m; j++) {
				campus[i][j] = temp.charAt(j);
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(campus[i][j] == 'I' && !visited[i][j])
					dfs(i, j);
			}
		}
		System.out.println(person == 0 ? "TT" : person);
	}
	
	static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m) {
				if(campus[nextX][nextY] != 'X' && !visited[nextX][nextY]) {
					if(campus[nextX][nextY] == 'P')
						person++;
					dfs(nextX, nextY);
				}
			}
		}
	}
}