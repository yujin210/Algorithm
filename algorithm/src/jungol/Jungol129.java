package jungol;

import java.util.Scanner;

public class Jungol129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double tw = 0;
		
		while(true) {
			System.out.print("Base = ");
			int base = sc.nextInt();
			
//			System.out.println();
			System.out.print("Height = ");
			int height = sc.nextInt();
			
//			System.out.println();
			tw = (double) base * (double) height / 2;
			System.out.println("Triangle width = " + Math.round(tw*10)/10.0);
			
//			System.out.println();
			System.out.print("Continue? ");
			char con = sc.next().charAt(0);
			
			if (con == 'y' || con == 'Y') {
			} else {
				break;
			}
		}
	}
}
