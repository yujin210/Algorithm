package jungol;

import java.util.Scanner;

public class Jungol126 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int even = 0;
		int odd = 0;
		int num = 0;
		
		while(true) {
			num = sc.nextInt();
			if (num == 0) {
				break;
			} else {
				if(num % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
