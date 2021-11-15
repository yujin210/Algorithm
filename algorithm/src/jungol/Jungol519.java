package jungol;

import java.util.Scanner;

public class Jungol519 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		num1 += 100;
		num2 %= 10;
		System.out.printf("%d %d", num1, num2);
	}
}
