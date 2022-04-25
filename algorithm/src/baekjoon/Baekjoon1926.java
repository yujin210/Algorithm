/*
1. 아이디어 
- 2중 for => 값 1 && 방문x => BFS
- BFS 돌면서 그림 개수 +1, 최대값을 갱신

2. 시간복잡도
- BFS : O(V+E)
- V : 500*500
- E : 4 * 500 * 500
- V+E : 5 * 250000 = 100만 < 2억 >> 가능!

3. 자료구조 
- 그래프 전체 지도 : int[][]
- 방문 : bool[][]
- Queue(BFS)
 */

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1926 {
	static int n; // 도화지의 세로 크기 
	static int m; // 도화지의 가로 크기 
	static int[][] canvas; // 도화지 
	static boolean[][] visited; // 방문이력 
	static int[] dx = {0, -1, 0, 1}; // 상하좌우 이동 좌표 
	static int[] dy = {1, 0, -1, 0}; // 상하좌우 이동 좌표 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		canvas = new int[n][m]; // 도화지 생성 
		visited = new boolean[n][m]; // 방문이력 생성 
		int count = 0; // 그림의 개수 
		int max = 0; // 가장 넓은 그림의 넓이 
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				canvas[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) { // 도화지 전체 탐색 
			for(int j = 0; j < m; j++) {
				if(!visited[i][j] && canvas[i][j] == 1) { // 방문한 적이 없고, 그림이 그려진 곳(값이 1) 탐색 
					count++; // 그림의 개수 증가 
					max = Math.max(max, bfs(i, j)); // 가장 넓은 그림의 넓이를 max에 저장 
				}
			}
		}
		
		System.out.println(count); // 그림의 개수 출력 
		System.out.println(count == 0 ? 0 : max); // 그림이 하나도 없을 경우 그림의 넓이는 0, 그 외는 그림의 넓이 출력 
	}

	static int bfs(int x, int y) { // 넓이 우선 탐색 
		Queue<int[]> que = new LinkedList<>(); // 큐 생성 
		
		int area = 1; // 그림의 넓이 (현재 위치도 그림이 있으므로 넓이는 1부터 시작)
		visited[x][y] = true; // 방문 처리 
		
		que.add(new int[] {x, y}); // 큐에 추가 
		
		while(!que.isEmpty()) { // 큐가 비어있지 않으면 반복 
			int[] now = que.poll(); // 큐에 있는 값 꺼내기 
			int nowX = now[0]; // 큐에서 꺼낸 x좌표 
			int nowY = now[1]; // 큐에서 꺼낸 y좌표 
			
			for(int i = 0; i < 4; i++) { // 상하좌우 이동
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m) { // 도화지의 범위를 벗어나지 않도록 관리 
					if(!visited[nextX][nextY] && canvas[nextX][nextY] == 1) { // 방문한 적이 없고, 그림이 그려진 곳이라면 
						area++; // 그림의 넓이 증가 
						visited[nextX][nextY] = true; // 방문 처리 
						que.add(new int[] {nextX, nextY}); // 큐에 추가 
					}
				}
			}
		}
		
		return area; // 이번 탐색 결과 얻은 그림의 넓이 반환 
	}
}