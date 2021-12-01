package jungol;

import java.util.Scanner;

public class Jungol575 {
	public static void main(String[] args) {
		involution();
	}
	static void involution() {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		double result = Math.pow(num1, num2);
		
		System.out.println((int)result);
	}
}
