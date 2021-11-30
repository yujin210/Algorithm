package jungol;

import java.util.Scanner;

public class Jungol573 {
	public static void main(String[] args) {
		square();
	}
	
	static void square() {
		 Scanner sc = new Scanner(System.in);
		 
		 int repeat = sc.nextInt();
		 int num = 1;
		 for(int i = 1; i <= repeat; i++) {
			 for(int j = 1; j <= repeat; j++) {
				 System.out.printf("%d ", num);
				 num++;
			 }
			 System.out.println();
		 }
	}
}
