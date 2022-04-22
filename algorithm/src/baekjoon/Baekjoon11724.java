package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11724 {
	static int node;		  // 정점의 수 
	static int edge;		  // 간선의 수 
	static int[][] graph;	  // 그래프  
	static boolean[] visited; // 방문기록 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 0; // 연결 요소의 수
		
		node = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		graph = new int[node+1][node+1];
		
		for(int i = 0; i < edge; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1; // 방향이 없는 그래프 이므로 a->b로 이동이 가능하고, b->a로도 이동이 가능하다. 
			graph[b][a] = 1;
		}
		
		visited = new boolean[node+1];
		
		for(int i = 1; i <= node; i++) { // 그래프의 각 노드에서 
			if(!visited[i]) {            // 방문 이력이 없는 노드라면 dfs 진행 
				dfs(i);
				answer++;				 // 연결된 노드들은 dfs 탐색을 하면서 이미 방문처리가 되어있을 것이므로, 방문 이력이 없다면 연결되어 있지 않다. => 연결 요소의 수 증가 
			}
		}
		
		System.out.println(answer);
	}
	
	static void dfs(int start) {
		visited[start] = true; // 방문처리 
		
		for(int i = 1; i <= node; i++) { // 방문 이력이 없으면서 연결되어 있는 노드는 dfs 진행 
			if(!visited[i] && graph[start][i] == 1) {
				dfs(i);
			}
		}
	}
}