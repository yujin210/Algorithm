package jungol;

import java.util.Scanner;

public class Jungol593 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ASCII code =? ");
			int ascii = sc.nextInt();
			
			if(ascii < 33 || ascii > 127) {
				break;
			} else {
				System.out.printf("%c\n", ascii);
			}			
		}
	}
}
