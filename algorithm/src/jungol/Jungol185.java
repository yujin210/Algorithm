package jungol;

import java.util.Scanner;

public class Jungol185 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char ch = sc.next().charAt(0);
		char search;
		
		for(int i = 0; i < str.length(); i++) {
			search = str.charAt(i);
			
			if (search==ch) {
				System.out.println(i);
				break;
			}
			
			if (i==(str.length()-1) && search!=ch) {
				System.out.println("No");
			}
		}
	}
}
