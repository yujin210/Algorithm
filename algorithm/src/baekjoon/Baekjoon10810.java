package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] basket = new int[Integer.parseInt(st.nextToken())+1];
		int balls = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < balls; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int ballNum = Integer.parseInt(st.nextToken());
			
			for(int j = start; j <= end; j++) {
				basket[j] = ballNum; 
			}
		}
		
		for(int i = 1; i < basket.length; i++) {
			System.out.print(basket[i] + " ");
		}
	}
}