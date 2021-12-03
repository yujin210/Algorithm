package jungol;

import java.util.Scanner;

public class Jungol576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		char operator = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		result(num1, operator, num2);
	}
	
	static void result(int num1, char operator, int num2) {
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		} else if(operator == '-') {
			result = num1 - num2;
		} else if(operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			result = num1 / num2;
		} else {
			result = 0;
		}
		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
}
