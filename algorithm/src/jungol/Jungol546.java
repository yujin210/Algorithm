package jungol;

import java.util.Scanner;

public class Jungol546 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		double sum = 0;
		double avg = 0;
		
		for(int i = 1; i <= size; i++) {
			sum += sc.nextDouble();
		}
		
		avg = Math.round((sum/size)*10) / 10.0;
		
		System.out.println("avg : " + avg);
		if(avg >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
}
