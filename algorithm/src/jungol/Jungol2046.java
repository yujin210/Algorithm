package jungol;

import java.util.Scanner;

public class Jungol2046 {
	public static void main(String[] args) {
		version();
	}
	
	static void version() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 길이
		int m = sc.nextInt(); // 종류 
		
		if(m == 1) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					System.out.printf("%d ", i);
				}
				System.out.println();
			}
		} else if (m == 2) {
			for(int i = 1; i <= n; i++) {
				if(i % 2 != 0) {
					for(int j = 1; j <= n; j++) {
						System.out.printf("%d ", j);
					}
				} else {
					for(int j = n; j >= 1; j--) {
						System.out.printf("%d ", j);
					}
				}
				System.out.println();
			}
		} else {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					System.out.printf("%d ", i*j);
				}
				System.out.println();
			}
		}
	}
}

