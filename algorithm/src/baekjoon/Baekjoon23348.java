package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon23348 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int oneHand = Integer.parseInt(st.nextToken());
		int noLook = Integer.parseInt(st.nextToken());
		int phone = Integer.parseInt(st.nextToken());
		
		int crew = Integer.parseInt(br.readLine());
		int[] score = new int[crew];
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		for(int i = 0; i < crew; i++) {
			for(int j = 0; j < 3; j++) {
				st = new StringTokenizer(br.readLine());
				cnt1 = Integer.parseInt(st.nextToken());
				cnt2 = Integer.parseInt(st.nextToken());
				cnt3 = Integer.parseInt(st.nextToken());

				score[i] += (oneHand*cnt1) + (noLook*cnt2) + (phone*cnt3);
			}
		}
		
		int max = score[0];
		for(int i = 1; i < crew; i++) {
			if(score[i] > max)
				max = score[i];
		}
		
		System.out.println(max);
	}
}