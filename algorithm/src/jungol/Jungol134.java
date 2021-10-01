package jungol;

import java.util.Scanner;

public class Jungol134 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int even = 0;
		int odd = 0;
		
		for(int i = 1; i <= 10; i++) {
			int num = sc.nextInt();
			
			if(num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
	}
}
