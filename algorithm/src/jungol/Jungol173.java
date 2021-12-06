package jungol;

import java.util.Scanner;

public class Jungol173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(sub(num1, num2));
		
	}
	
	static int sub(int num1, int num2) {
		int result = 0;
		num1 *= num1;
		num2 *= num2;
		
		if(num1 > num2) {
			result = num1-num2;
		} else {
			result = num2-num1;
		}
		return result;
	}
}
