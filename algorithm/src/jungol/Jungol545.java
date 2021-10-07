package jungol;

import java.util.Scanner;

public class Jungol545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mul3 = 0;
		int mul5 = 0;
		
		for(int i = 1; i <= 10; i++) {
			int num = sc.nextInt();
			
			if(num % 3 == 0) {
				mul3++; 
			}
			
			if(num % 5 == 0) {
				mul5++;
			}
		}
		System.out.println("Multiples of 3 : " + mul3);
		System.out.println("Multiples of 5 : " + mul5);
	}
}
