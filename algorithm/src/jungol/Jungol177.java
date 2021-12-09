package jungol;

import java.util.Scanner;

public class Jungol177 {
	public static void main(String[] args) {
		abs();
	}
	
	static void abs() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			sum += Math.abs(sc.nextInt());
		}
		
		System.out.println(sum);
	}
}
