package baekjoon;

import java.util.Scanner;

public class Baekjoon11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kind = sc.nextInt();
		int total = sc.nextInt();
		int[] coin = new int[kind];
		int answer = 0;
		int idx = kind-1;
		
		for(int i = 0; i < kind; i++) {
			coin[i] = sc.nextInt();
		}
		
		while(total != 0) {
			if(coin[idx] <= total) {
				total -= coin[idx];
				answer++;
			} else {
				idx--;
			}
		}
		
		System.out.println(answer);
	}
}
