package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon2583 {
	static int m; // 높이 
	static int n; // 너비
	static int[][] board; // 모눈종이 
	static boolean[][] visited; // 방문이력 
	static int[] row = {0, 0, -1, 1}; // 상하좌우 이동할 때 사용할 좌표 
	static int[] col = {-1, 1, 0, 0}; // 상하좌우 이동할 때 사용할 좌표 
	static ArrayList<Integer> answer = new ArrayList<>(); // 분리된 각 영역의 넓이를 저장할 ArrayList 
	static int area; // 넓이 기록용 변수 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken()); // 직사각형 좌표의 개수 
		
		board = new int[m][n]; // 모눈종이 생성 
		visited = new boolean[m][n]; // 방문이력 생성 
		
		for(int i = 0; i < k; i++) { // 직사각형 좌표의 개수만큼 반복 
			st = new StringTokenizer(br.readLine()); // 한 줄씩 입력 받음 
			int leftX = Integer.parseInt(st.nextToken()); // 왼쪽 아래 꼭짓점의 x좌표 
			int leftY = Integer.parseInt(st.nextToken()); // 왼쪽 아래 꼭짓점의 y좌표 
			int rightX = Integer.parseInt(st.nextToken()); // 오른쪽 위 꼭짓점의 x좌표 
			int rightY = Integer.parseInt(st.nextToken()); // 오른쪽 위 꼭짓점의 y좌표 
			
			for(int y = leftY; y < rightY; y++) { 
				for(int x = leftX; x < rightX; x++) {
					board[y][x] = 1; // 입력받은 좌표를 바탕으로 모눈종이 채우기 
				}
			}
		}
		
		for(int i = 0; i < m; i++) { // 전체 탐색 
			for(int j = 0; j < n; j++) {
				if(!visited[i][j] && board[i][j] == 0) { // 방문한 적이 없으며 직사각형이 채워지지 않은 부분 탐색 
					dfs(i, j);
					answer.add(area); // 탐색이 끝나면 기록한 넓이 저장 
					area = 0; // 기록 초기화 
				}
			}
		}
		
		System.out.println(answer.size()); // 분리되어 나누어지는 영역의 개수 
		
		Collections.sort(answer); // 각 영역의 넓이 오름차수 정렬 
		
		for(int i = 0; i < answer.size(); i++) { // 각 영역의 넓이 출력 
			if(i == answer.size()-1) 
				System.out.println(answer.get(i));
			else
				System.out.print(answer.get(i) + " ");
		}

	}
	
	static void dfs(int i, int j) {
		area++; // 탐색을 할 때마다 넓이 1씩 증가 
		visited[i][j] = true; // 방문 처리 
		
		for(int a = 0; a < 4; a++) { // 상하좌우 좌표 이동 
			int r = i + row[a];
			int c = j + col[a];
			
			if(r >= 0 && r <= m-1 && c >= 0 && c <= n-1) { // 좌표가 모눈종이를 벗어나지 않도록 관리 
				if(!visited[r][c] && board[r][c] == 0) { // 방문이력이 없고 직사각형이 채워지지 않은 부분 탐색 
					dfs(r, c);
				}
			}
		}
	}
}