package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2606 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static int[][] node;
	static boolean[] visited;
	static int answer = 0;

	public static void main(String[] args) throws IOException {
		int computer = Integer.parseInt(br.readLine());
		int network = Integer.parseInt(br.readLine());
		
		node = new int[computer+1][computer+1];
		visited = new boolean[computer+1];
		
		for(int i = 0; i < network; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			node[s][e] = 1;
			node[e][s] = 1;
		}
		
		answer += dfs(1);
		
		System.out.println(answer);
	}

	static int dfs(int start) {
		
		visited[start] = true;
		
		for(int i = 1; i < visited.length; i++) {
			if(start != i && visited[i] == false && node[start][i] == 1)
				dfs(i);
		}
		
		return answer++;
	}
}
