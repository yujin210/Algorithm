package jungol;

import java.util.Scanner;

public class Jungol540 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			
			if (num == -1) {
				break;
			} else if(num % 3 == 0) {
				System.out.println(num / 3);
			}
		}
	}
}
