package jungol;

import java.util.Scanner;

public class Jungol179 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		first(num1, num2, num3);
		second(num1, num2, num3);
	}
	
	static void first(double num1, double num2, double num3) {
		double sum = num1 + num2 + num3;
		double avg = sum / 3;
		System.out.println(Math.round(avg));
	}
	
	static void second(double num1, double num2, double num3) {
		num1 = Math.round(num1);
		num2 = Math.round(num2);
		num3 = Math.round(num3);
		
		double sum = num1 + num2 + num3;
		double avg = sum / 3;
		System.out.println(Math.round(avg));
	}
}
