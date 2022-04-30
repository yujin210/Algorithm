package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon20361 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] cups = new int[Integer.parseInt(st.nextToken())+1];
		cups[Integer.parseInt(st.nextToken())] = 1;
		int change = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < change; i++) {
			st = new StringTokenizer(br.readLine());
			int swap1 = Integer.parseInt(st.nextToken());
			int swap2 = Integer.parseInt(st.nextToken());
			
			int temp = cups[swap1];
			cups[swap1] = cups[swap2];
			cups[swap2] = temp;
		}
		
		for(int i = 1; i < cups.length; i++) {
			if(cups[i] == 1) {
				System.out.println(i);
				break;
			}
		}
	}
}