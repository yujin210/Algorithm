package jungol;

import java.util.Scanner;

public class Jungol121 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("zero");
		} else if (num > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
	}
}
