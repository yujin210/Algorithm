package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1260 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	
	static int[][] node;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 노드의 수 
		int m = Integer.parseInt(st.nextToken()); // 간선의 수 
		int v = Integer.parseInt(st.nextToken()); // 탐색을 시작할 노드 번호
		
		node = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		// 노드 연결 (초기화)
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			node[s][e] = 1;
			node[e][s] = 1;
		}
		
		initVisited();
		
		dfs(v);
		sb.append("\n");
		bfs(v);
		
		System.out.println(sb);
	}
	
	// 방문 여부 초기화 
	static void initVisited() {
		for(int i = 0; i < visited.length; i++)
			visited[i] = false;
	}
	
	static void dfs(int start) {
		sb.append(start + " ");
		
		visited[start] = true;
		
		for(int i = 1; i < visited.length; i++) {
			if(i != start && visited[i] == false && node[start][i] == 1) {
				dfs(i);
			}
		}
	}
	
	static void bfs(int start) {
		initVisited();
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(start);
		
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int num = queue.poll();
			sb.append(num + " ");
			
			for(int i = 1; i < visited.length; i++) {
				if(i != start && visited[i] == false && node[num][i] == 1) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
		
		sb.append("\n");
	}
}
