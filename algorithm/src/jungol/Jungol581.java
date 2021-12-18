package jungol;

import java.util.Scanner;

public class Jungol581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intNum1 = sc.nextInt();
		int intNum2 = sc.nextInt();
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		big(intNum1, intNum2);
		small(num1, num2);
	}
	
	static void big(int intNum1, int intNum2) {
		if(Math.abs(intNum1) > Math.abs(intNum2)) {
			System.out.println(intNum1);
		} else {
			System.out.println(intNum2);
		}
	}
	
	static void small(double num1, double num2) {
		if(Math.abs(num1) > Math.abs(num2)) {
			System.out.printf("%.2f", num2);
		} else {
			System.out.printf("%.2f", num1);
		}
	}
}
