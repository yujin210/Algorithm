package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10026 {
	static int n; // 그림의 크기 
	static char[][] picture; // 그림 
	static boolean[][] visited; // 방문 이력 
	static int[] row = {0, 0, -1, 1}; // 상하좌우 인접 여부 판단할 좌표 
	static int[] col = {-1, 1, 0, 0}; // 상하좌우 인접 여부 판단할 좌표 
	static boolean colorWeakness = false; // 색약 여부 
	static int section = 0; // 구역의 수 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); // 그림의 크기 입력 
		picture = new char[n][n];  // 그림을 담을 배열의 크기 
		visited = new boolean[n][n]; // 방문 이력 
		char color; // 그림의 색상을 저장할 변수 
		
		for(int i = 0; i < n; i++) {
			String temp = br.readLine();
			for(int j = 0; j < n; j++) {
				picture[i][j] = temp.charAt(j);
			}
		}
		
		
		// 적록색약이 아닌 사람이 봤을 때 구역의 수 
		for(int i = 0; i < n; i++) { // 전체 그림 하나씩 탐색 
			for(int j = 0; j < n; j++) {
				color = picture[i][j];
				if(!visited[i][j] && color == 'R') { // 색이 빨간색일 경우 
					section++;
					dfs(i, j, color, colorWeakness);
				} else if (!visited[i][j] && color == 'G') { // 색이 초록색일 경우 
					section++;
					dfs(i, j, color, colorWeakness);
				} else if (!visited[i][j] && color == 'B') { // 색이 파란색일 경우 
					section++;
					dfs(i, j, color, colorWeakness);
				}
			}
		}
		
		System.out.print(section + " "); // 적록색약이 아닌 사람이 봤을 때 구역의 수 

		section = 0; // 구역 초기화 
		colorWeakness = true; // 색약 여부 true로 변경 
		visited = new boolean[n][n]; // 방문 이력 초기화 
		
		// 적록색약인 사람이 봤을 때 구역의 수
		for(int i = 0; i < n; i++) { // 전체 그림 하나씩 탐색 
			for(int j = 0; j < n; j++) {
				color = picture[i][j];
				if(!visited[i][j] && (color == 'R' || color == 'G')) { // 적록색약은 빨간색과 초록색을 하나의 색깔로 인식하도록 프로그래밍 
					section++;
					dfs(i, j, color, colorWeakness);
				} else if (!visited[i][j] && color == 'B') { // 색이 파란색일 경우 
					section++;
					dfs(i, j, color, colorWeakness);
				}
			}
		}
		
		System.out.println(section); // 적록색약인 사람이 봤을 때 구역의 수 
	}
	
	static void dfs(int i, int j, char color, boolean colorWeakness) {
		visited[i][j] = true; // 방문 처리 
		
		char inputColor = color; // 입력으로 들어온 색상 저장 
		int r; // 이동시 좌표 
		int c; // 이동시 좌표 
		
		for(int a = 0; a < 4; a++) { // 상하좌우 움직이며 인접한 구역 확인 
			r = i + row[a];
			c = j + col[a];

			if(r >= 0 && r <= n-1 && c >= 0 && c <= n-1) { // 그림의 범위를 벗어나지 않도록 관리 
				color = picture[r][c]; // 새로운 좌표의 색상 저장 
				
				if(colorWeakness == true && (inputColor == 'R' || inputColor == 'G') && (color == 'R' || color == 'G') && !visited[r][c]) {
					// 적록색약일 때는 빨간색과 초록색의 구분이 명확하지 않으므로 || 연산자를 사용하여 탐색하도록 함 (적록색약o && (들어온 색상 빨강or초록)&&(현재 색상 빨강or초록) && 방문이력 없음) 
					dfs(r, c, color, colorWeakness); 
				} else if (inputColor == 'B' && color == 'B' && !visited[r][c]) { // 파란색은 적록색약과 관계가 없으므로 들어온 색상과 현재 이동한 위치의 색상이 동일한지, 그리고 방문이력이 없는지만 확인)
					dfs(r, c, color, colorWeakness);
				} else if (colorWeakness == false && inputColor == 'R' && color == 'R' && !visited[r][c]) { // 색약이 아니라면 빨간색과 초록색을 각각 구분함. && 방문이력 없음 
					dfs(r, c, color, colorWeakness);
				} else if (colorWeakness == false && inputColor == 'G' && color == 'G' && !visited[r][c]) {
					dfs(r, c, color, colorWeakness);
				}
			}
		}			

	}
}