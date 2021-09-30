package jungol;

import java.util.Scanner;

public class Jungol139 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			for(int i = 1; i <= 9; i++) {
				for(int j = num1; j >= num2; j--) {
					if (i*j / 10 == 0) {
						System.out.print(j + " * " + i + " = " + " " + j*i + "   ");
					} else {
						System.out.print(j + " * " + i + " = " + j*i + "   ");						
					}
				}
				System.out.println();
			}
		} else {
			for(int i = 1; i <= 9; i++) {
				for(int j = num1; j <= num2; j++) {
					if (i*j / 10 == 0) {
						System.out.print(j + " * " + i + " = " + " " + j*i + "   ");
					} else {
						System.out.print(j + " * " + i + " = " + j*i + "   ");						
					}
				}
				System.out.println();
			}
		}
	}
}
