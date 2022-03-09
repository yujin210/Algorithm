package baekjoon;

import java.util.Scanner;

public class Baekjoon2953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				score[i] += sc.nextInt();
			}
		}
		
		int max = score[0];
		int best = 0;
		for(int i = 1; i < 5; i++) {
			if(max < score[i]) {
				max = score[i];
				best = i;
			}
		}
		
		System.out.printf("%d %d", best+1, max);
	}
}
