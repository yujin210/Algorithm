package baekjoon;

import java.util.Scanner;

public class Baekjoon14720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] store = new int[n];
		int before = -1;
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			store[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(before == -1 && store[i] == 0) {
				answer++;
				before = 0;
			} else if (before == 0 && store[i] == 1) {
				answer++;
				before = 1;
			} else if (before == 1 && store[i] == 2) {
				answer++;
				before = 2;
			} else if (before == 2 && store[i] == 0) {
				answer++;
				before = 0;
			}
		}
		
		System.out.println(answer);
	}
}