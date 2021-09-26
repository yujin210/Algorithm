package jungol;

import java.util.Scanner;

public class Jungol123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.print("Number? ");
		
		switch(num) {
			case 1 :
				System.out.println("dog");
				break;
				
			case 2 : 
				System.out.println("cat");
				break;
				
			case 3 : 
				System.out.println("chick");
				break;
				
			default : 
				System.out.println("I don't know.");
		}
	}
}
