/*
1. 아이디어 
- BFS 탐색 : 출발점에서 도착점까지 최소 칸 수를 구해야 하는데, BFS는 현재 노드에서 가까운 곳부터 찾기 때문에 결과가 곧 최단 경로가 됨 
- 값이 1이고 방문한 적이 없는 좌표를 방문하면서 해당 위치의 값을 1씩 증가시켜줌
- 최종 위치에 도달하면 해당 위치까지 도달하는데 지나는 칸 수를 알 수 있음 

2. 시간복잡도 
- BFS : O(V+E)
- V : 100 * 100 = 10000
- E : 4 * 100 * 100 = 40000
- V+E : 10000 + 40000 = 50000 < 2억 => 가능 

3. 자료구조 
- 세로 칸의 크기 : N
- 가로 칸의 크기 : M
- 미로 : int[][]
- 방문 : boolean[][]
*/

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon2178 {
	static int N; // 미로의 세로 칸 수 
	static int M; // 미로의 가로 칸 수 
	static int[][] maze; // 미로 
	static boolean[][] visited; // 방문이력 -> 한 번 간 곳은 다시 갈 필요 없음 
	static int dx[] = {0, -1, 0, 1}; // 상하좌우 인접한 곳 탐색 
	static int dy[] = {-1, 0, 1, 0}; // 상하좌우 인접한 곳 탐색 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); // 미로의 세로 길이 입력 받기 
		M = Integer.parseInt(st.nextToken()); // 미로의 가로 길이 입력 받기 
		
		maze = new int[N][M]; // 미로 생성 
		visited = new boolean[N][M]; // 방문이력 생성 
		
		for(int i = 0; i < N; i++) {
			String temp = br.readLine(); // 한 줄씩 입력 받음 (각각의 수들이 붙어서 입력 => 구분자 없음 => charAt()을 사용해 인덱스로 분리)
			for(int j = 0; j < M; j++) {
				maze[i][j] = temp.charAt(j)-'0'; // 현재 문자타입이므로 정수형 배열에 넣게 되면 정수 0 또는 1이 아닌, 문자'0' 또는 '1'의 값이 들어감 
				// 때문에 문자 '0' 만큼 빼줘서 값이 제대로 입력될 수 있게 함 
			}
		}

		bfs(0, 0); // 시작점 0, 0을 기준으로 너비우선탐색
		System.out.println(maze[N-1][M-1]); // 탐색이 종료된 후 바뀌어 저장된 값을 출력 
	}
	
	static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>(); // bfs를 구현할 큐 생성 
		
		visited[x][y] = true; // 방문 처리 
		queue.add(new int[] {x, y}); // 큐에 현재 위치 삽입 
		
		while(!queue.isEmpty()) { // 큐가 비어있지 않으면 반복  
			int[] now = queue.poll(); // 큐 삭제
			int nowX = now[0]; // 큐에 담겨 있던 x좌표 
			int nowY = now[1]; // 큐에 담겨 있던 y좌표 
			
			for(int i = 0; i < 4; i++) { // 상하좌우 이동 
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) { // 이동한 좌표가 미로의 범위를 벗어나지 않도록 함 
					if(!visited[nextX][nextY] && maze[nextX][nextY] == 1) { // 방문한 적이 없으면서 이동 가능한 경우 
						visited[nextX][nextY] = true; // 해당 위치 방문처리 
						maze[nextX][nextY] = maze[nowX][nowY] + 1; // 해당 값을 이전 값보다 +1 증가시킴 
						queue.add(new int[] {nextX, nextY}); // 해당 좌표 큐에 추가 
					}
				}
			}
		}
	}
}