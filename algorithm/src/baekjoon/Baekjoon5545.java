package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon5545 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 토핑 종류의 수 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] price = new int[2]; // 도우의 가격과 토핑의 가격 
		for(int i = 0; i < 2; i++) { // price[0] : 도우의 가격, price[1] : 토핑의 가격
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		int kcalD = Integer.parseInt(br.readLine()); // 도우의 열량
		int[] kcalT = new int[n]; // 토핑의 열량
		
		for(int i = 0; i < n; i++) {
			kcalT[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(kcalT);
		
		int best = kcalD / price[0]; // 토핑 올리지 않은 도우의 1원당 열량
		
		int totalKcal = kcalD;
		int totalPrice = price[0];
		int newBest = 0;
		
		for(int i = n-1; i >= 0; i--) {
			totalKcal += kcalT[i];
			totalPrice += price[1];
			newBest = totalKcal/totalPrice;
			
			if(best > newBest) 
				break;
			else 
				best = newBest;
		}
		
		System.out.println(best);
	}
}