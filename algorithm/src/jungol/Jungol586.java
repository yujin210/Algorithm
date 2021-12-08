package jungol;

import java.util.Scanner;

public class Jungol586 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		square(num1, num2);
		cube(num1, num2);
	}
	
	static void square(int num1, int num2) {
		int sub = num1 - num2;
		int result = sub*sub;
		
		System.out.printf("(%d - %d) ^ 2 = %d\n", num1, num2, result);
	}
	
	static void cube(int num1, int num2) {
		int add = num1 + num2;
		int result = add*add*add;
		
		System.out.printf("(%d + %d) ^ 3 = %d\n", num1, num2, result);
	}
}
