package baekjoon;

import java.util.Scanner;

public class Baekjoon2748 {
	static long[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		dp = new long[n+1];
		
		System.out.println(fibonacci(n));
	}
	
	static long fibonacci(int n) {
		if(n <= 1)
			return n;
		else if (dp[n] != 0)
			return dp[n];
		else
			return dp[n] = fibonacci(n-1) + fibonacci(n-2);
	}
}