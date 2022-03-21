package baekjoon;

import java.util.Scanner;

public class Baekjoon9295 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] dice = new int[t];
		
		for(int i = 0; i < t; i++) {
			dice[i] += sc.nextInt();
			dice[i] += sc.nextInt();
		}
		
		for(int i = 1; i <= t; i++) {
			System.out.printf("Case %d: %d\n", i, dice[i-1]);
		}
	}
}
