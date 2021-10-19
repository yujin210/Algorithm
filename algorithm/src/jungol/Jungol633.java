package jungol;

import java.util.Scanner;

public class Jungol633 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] strArr = {"1. Korea", "2. USA", "3. Japan", "4. China"};
		
		int num = 0;
		while(true) {
			for(int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]);
			}
			
			System.out.print("number? ");
			
			num = sc.nextInt();
			System.out.println();
			if (1 <= num && num <= 4) {
				switch(num) {
				case 1 : 
					System.out.println("Seoul");
					break;
					
				case 2 : 
					System.out.println("Washington");
					break;
					
				case 3 : 
					System.out.println("Tokyo");
					break;
					
				case 4 : 
					System.out.println("Beijing");
					break;
				}
				System.out.println();
			} else { 
				System.out.println("none"); 
				break; 
			}
		}
	}
}
