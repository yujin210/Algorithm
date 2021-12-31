package jungol;

import java.util.Scanner;

public class Jungol634 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String star = "*";
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
}
