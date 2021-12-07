package jungol;

import java.util.Scanner;

public class Jungol178 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(square(num));
	}
	
	static int square(int num) {
		int result = 1;
		for(int i = 1; i <= num; i++) {
			result *= 2;
		}
		return result;
	}
}
