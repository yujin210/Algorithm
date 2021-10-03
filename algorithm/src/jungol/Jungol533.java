package jungol;

import java.util.Scanner;

public class Jungol533 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		
		if(gender == 'M') {
			if(age >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else {
			if(age >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		}
	}
}
