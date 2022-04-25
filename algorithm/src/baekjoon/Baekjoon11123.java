package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11123 {
		static int H;
		static int W;
		static char[][] farm;
		static boolean[][] visited;
		static int sheep;
		static int[] row = {0, 0, -1, 1};
		static int[] col = {-1, 1, 0, 0};
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int k = 0; k < testCase; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			farm = new char[H][W];
			visited = new boolean[H][W];
			
			for(int i = 0; i < H; i++) {
				String temp = br.readLine();
				for(int j = 0; j < W; j++) {
					farm[i][j] = temp.charAt(j);
				}
			}
			
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(!visited[i][j] && farm[i][j] == '#') {
						dfs(i, j);
						sheep++;
					}
				}
			}
			
			System.out.println(sheep);
			sheep = 0;
		}
	}
	
	static void dfs(int i, int j) {
		visited[i][j] = true;
		
		for(int a = 0; a < 4; a++) {
			int r = i + row[a];
			int c = j + col[a];
			
			if(r >= 0 && r < H && c >= 0 && c < W) {
				if(!visited[r][c] && farm[r][c] == '#') 
					dfs(r, c);
			}
		}
	}
}