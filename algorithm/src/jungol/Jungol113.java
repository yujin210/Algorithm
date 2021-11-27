package jungol;

import java.util.Scanner;

public class Jungol113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int length = sc.nextInt();
		
		width += 5;
		length *= 2;
		int area = width * length;
		
		System.out.println("width = " + width);
		System.out.println("length = " + length);
		System.out.println("area = " + area);
	}
}
