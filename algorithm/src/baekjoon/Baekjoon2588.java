package baekjoon;

import java.util.Scanner;

public class Baekjoon2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); // 1�� �ڿ���
		int num2 = sc.nextInt(); // 2�� �ڿ���
		int digit1 = 1; // 1�� �ڸ���
		int digit2 = 1; // 10�� �ڸ���
		int digit3 = 1; // 100�� �ڸ���
		int result1 = 0; // 3�� ���
		int result2 = 0; // 4�� ���
		int result3 = 0; // 5�� ���
		int total = 0;
		
		digit1 = num2 % 10;
		result1 = num1 * digit1;
		System.out.println(result1); // 
		
		digit2 = (((num2 / 10) % 10) * 10);
		result2 = num1 * digit2;
		System.out.println(result2 / 10);
		
		digit3 = ((num2 / 100) * 100);
		result3 = num1 * digit3;
		System.out.println(result3 / 100);
		
		total = result1 + result2 + result3;
		System.out.println(total);
	}

}

