package jungol;

import java.util.Scanner;

public class Jungol572 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		area(r);
		
	}
	
	public static void area(int r) {		
		float pi = (float) 3.14;
		float result = r*r*pi;

		//System.out.printf("%.02f", result);
		System.out.println(String.format("%.2f", result));
	}
}
