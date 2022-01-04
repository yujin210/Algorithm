package jungol;

import java.util.Scanner;

public class Jungol597 {
	public static void main(String[] args) {
		length();
	}
	
	static void length() {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println(str1.length() + str2.length());
	}
}
