package jungol;

import java.util.Scanner;

public class Jungol538 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("number? ");
			int num = sc.nextInt();
			
			if (num < 0) {
				System.out.println("negative number");
			} else if (num > 0) {
				System.out.println("positive integer");
			} else {
				break;
			}
		}
	}
}
