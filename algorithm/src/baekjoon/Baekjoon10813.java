package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10813 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] basket = new int[Integer.parseInt(st.nextToken())+1]; // 바구니는 1번부터인데, 인덱스는 0번 부터이므로 인덱스 신경쓰지 않기 위해 배열을 한 칸 크게 만들었음
		int change = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < basket.length; i++) {
			basket[i] = i;
		}
		
		for(int i = 0; i < change; i++) {
			st = new StringTokenizer(br.readLine());
			int swap1 = Integer.parseInt(st.nextToken());
			int swap2 = Integer.parseInt(st.nextToken());
			
			int temp = basket[swap1];
			basket[swap1] = basket[swap2];
			basket[swap2] = temp;
		}
		
		for(int i = 1; i < basket.length; i++) { // 0번 인덱스는 사용하지 않으므로 1번 인덱스부터 출력 
			System.out.print(basket[i] + " ");
		}
	}
}