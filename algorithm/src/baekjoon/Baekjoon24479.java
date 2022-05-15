package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon24479 {
	static int n, m, r, cnt;
	static int[] order;
	static List<Integer>[] list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		list = new ArrayList[n + 1];

		for(int i = 1; i <= n; i++)
			list[i] = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			list[u].add(v);
			list[v].add(u);
		}

		// 오름차순으로 방문하기 위해 정렬
		for (int i = 1; i <= n; i++) {
			Collections.sort(list[i]);
		}

		order = new int[n + 1];
		order[r] = 1;
		boolean[] visited = new boolean[n + 1];
		visited[r] = true;
		cnt = 1;
		dfs(r, visited);
		
		for (int i = 1; i <= n; i++) {
			System.out.println(order[i]);
		}
	}

	static void dfs(int node, boolean[] visited) {
		if (list[node].size() == 0)
			return;

		for (int i : list[node]) {
			if (!visited[i]) {
				cnt++;
				order[i] = cnt;
				visited[i] = true;
				dfs(i, visited);
			}
		}

	}
}