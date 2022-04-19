package baekjoon;

import java.util.Scanner;

public class Baekjoon1049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cut = sc.nextInt();				// 끊어진 기타줄의 개수 
		int brand = sc.nextInt();			// 기타줄 브랜드의 개수 
		int[][] price = new int[brand][2];	// 각 브랜드 별 패키지의 가격과 낱개의 가격 
		int answer = 0;
		
		for(int i = 0; i < brand; i++) {
			price[i][0] = sc.nextInt();
			price[i][1] = sc.nextInt();
		}
		
		int[] cheap = {price[0][0], price[0][1]};	// 저렴한 기타줄 가격 (패키지, 낱개) 
		
		for(int i = 1; i < brand; i++) {			// 가장 저렴한 기타줄 고르기 
			if(cheap[0] > price[i][0])
				cheap[0] = price[i][0];
			
			if(cheap[1] > price[i][1])
				cheap[1] = price[i][1];
		}

		if(cut > 6) {
			if(cheap[1]*6 > cheap[0]) {
				answer = Math.min(cheap[0]*((cut/6)+1), cheap[0]*(cut/6) + cheap[1]*(cut%6));
			} else {
				answer = cheap[1]*cut;
			}
		} else if (cut <= 6)
			answer = Math.min(cheap[0], cheap[1]*cut);

		System.out.println(answer);
	}
}