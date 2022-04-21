package baekjoon;

import java.util.Scanner;

public class Baekjoon5347 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			
			System.out.println(a*b/gcd(a,b));
		}
	}
	
	static long gcd(long a, long b) {
		if(b == 0)
			return a;
		else
			return gcd(b, a%b);
	}
}