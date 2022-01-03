package jungol;

import java.util.Scanner;

public class Jungol596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int num = sc.nextInt();
		
		if(str.length() < num) {
			for(int i = str.length()-1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
		} else {
			for(int i = str.length()-1; i >= str.length()-num; i--) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
