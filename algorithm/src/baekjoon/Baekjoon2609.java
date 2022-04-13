package baekjoon;

import java.util.Scanner;

public class Baekjoon2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd = gcd(a, b);
		int lcm = lcm(a, b);
		
		System.out.println(gcd);
		System.out.println(lcm);
	}
	
	// 최대공약수
	static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else 
			return gcd(b, a%b);
	}
	
	// 최소공배수
	static int lcm(int a, int b) {
		return a*b / gcd(a, b);
	}
}