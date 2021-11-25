package jungol;

import java.util.Scanner;

public class Jungol525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.print("true" + " ");
		} else {
			System.out.print("false" + " ");
		}
		
		if(num1 == num2 && num2 == num3) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}
	}
}
