package baekjoon;

import java.util.Scanner;

public class Baekjoon2847 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] score = new int[n];
		int answer = 0;
		int temp = 0;
		
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}
		
		for(int i = n-2; i >= 0; i--) {
			if(score[i+1] <= score[i]) {
				temp = score[i] - (score[i+1]-1);
				answer += temp;
				score[i] -= temp;
			}
		}
		
		System.out.println(answer);
	}
}