package jungol;

import java.util.Scanner;

public class Jungol1309 {
	static long factorial(long n) {
		
		if (n == 0)
			return 1;
		else {
			if (n-1 == 0)
				System.out.printf("%d! = %d\n", n, n);
			else {
				System.out.printf("%d! = %d * %d!\n", n, n, n-1);
			}
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
	}
}
