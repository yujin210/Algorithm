package jungol;

import java.util.Scanner;

public class Jungol571 {
	public static void main(String[] args) {
		str();
	}
	
	static void str() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = "~!@#$^&*()_+|";
		
		for(int i = 1; i <= num; i++) {
			System.out.println(str);
		}
	}
}
