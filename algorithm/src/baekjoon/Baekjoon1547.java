package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1547 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] ball = {false, true, false, false}; // 인덱스와 컵의 번호를 맞추기 위해 컵의 개수보다 +1 더 큰 배열을 생성
		// 1번 컵에 공이 있으므로 1번 인덱스를 true로 설정하였음 
		
		int change = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < change; i++) {
			st = new StringTokenizer(br.readLine());
			int swap1 = Integer.parseInt(st.nextToken());
			int swap2 = Integer.parseInt(st.nextToken());
			
			boolean temp = ball[swap1];
			ball[swap1] = ball[swap2];
			ball[swap2] = temp;
		}
		
		for(int i = 1; i < ball.length; i++) {
			if(ball[i] == true) {
				System.out.println(i);
				break;
			}
		}
	}
}