package jungol;

import java.util.Scanner;

public class Jungol149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int odd = 1;
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				if(odd > 9) {
					odd = 1;
				}
				System.out.printf("%d ", odd);
				odd += 2;
			}
			System.out.println();
		}
	}
}
