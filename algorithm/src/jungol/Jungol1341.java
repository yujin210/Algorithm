package jungol;

import java.util.Scanner;

public class Jungol1341 {
	public static void main(String[] args) {
		mul();
	}
	
	static void mul() {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		while(s > 9 || s < 2 || e > 9 || e < 2) {
			System.out.println("INPUT ERROR!");
			s = sc.nextInt();
			e = sc.nextInt();
		}
		
		if(s > e) {
			for(int i = s; i >= e; i--) {
				for(int j = 1; j <= 9; j++) {
					if(j == 3 || j == 6 || j == 9) {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);		
						System.out.println();
					} else {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);						
					}
				}
				System.out.println();
			}
		} else {
			for(int i = s; i <= e; i++) {
				for(int j = 1; j <= 9; j++) {
					if(j == 3 || j == 6 || j == 9) {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);
						System.out.println();
					} else {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);
					}
				}
				System.out.println();
			}
		}
	}
}
