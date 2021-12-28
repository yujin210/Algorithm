package jungol;

import java.util.Scanner;

public class Jungol172 {
	public static void main(String[] args) {
		square();
	}
	
	static void square() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				System.out.printf("%d ", i*j);
			}
			System.out.println();
		}
	}
}

