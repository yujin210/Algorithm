package jungol;

import java.util.Scanner;

public class Jungol136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numIn = sc.nextInt();
		int numOut = 0;
		for(int i = 1; i <= 10; i++) {
			numOut = numIn * i;
			System.out.printf("%d ", numOut);
		}
	}
}
