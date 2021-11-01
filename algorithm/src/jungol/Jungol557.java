package jungol;

import java.util.Scanner;

public class Jungol557 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] chArr = new char[10];
		
		for(int i = 0; i < chArr.length; i++) {
			char ch = sc.next().charAt(0);	
			chArr[i] = ch;
		}	

		System.out.println(chArr[0] + " " + chArr[3] + " " + chArr[6]);
	}
}
