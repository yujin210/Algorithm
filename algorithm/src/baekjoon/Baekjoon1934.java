package baekjoon;

import java.util.Scanner;

public class Baekjoon1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println((a*b)/gcd(a, b));
		}	
	}
	
	static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd(b, a%b);
	}
}