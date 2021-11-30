package jungol;

import java.util.Scanner;

public class Jungol574 {
	public static void main(String[] args) {
		max();
	}
	
	static void max() {
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num2 > max) {
			max = num2;
			
			if(num3 > max) {
				max = num3;
			}
		} else {
			if (num3 > max) {
				max = num3;
			}
		}
		
		System.out.println(max);
	}
}
