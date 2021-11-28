package jungol;

import java.util.Scanner;

public class Jungol577 {
	public static void main(String[] args) {
		result();
	}
	
	static void result() {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			num1 /= 2;
			num2 *= 2;
		} else {
			num2 /= 2;
			num1 *= 2;
		}
		System.out.printf("%d %d", num1, num2);
	}
}

