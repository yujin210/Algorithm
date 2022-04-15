package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class Baekjoon16435 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int snake = sc.nextInt();
		int[] fruits = new int[n];
		
		for(int i = 0; i < n; i++) {
			fruits[i] = sc.nextInt();
		}
		
		Arrays.sort(fruits);

		int idx = 0;
		while(n > idx && snake >= fruits[idx]) {
			snake++;
			idx++;
			
		}
		
		System.out.println(snake);
	}
}