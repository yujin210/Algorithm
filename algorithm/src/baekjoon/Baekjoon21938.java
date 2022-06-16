package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon21938 {
	static int N;
	static int M;
	static int[][] screen;
	static boolean[][] visited;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int count = 0;
	static int boundary;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		screen = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				int sum = 0;
				for(int k = 0; k < 3; k++) {
					sum += Integer.parseInt(st.nextToken());
				}
				screen[i][j] = sum/3;
			}
		}
		
		boundary = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(screen[i][j] >= boundary)
					screen[i][j] = 255;
				else
					screen[i][j] = 0;
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(screen[i][j] == 255 && !visited[i][j]) {
					dfs(i, j);
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < N && ny >= 0 && ny < M) {
				if(screen[nx][ny] == 255 && !visited[nx][ny])
					dfs(nx, ny);
			}
		}
	}
}