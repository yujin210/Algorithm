package jungol;

import java.util.Scanner;

public class Jungol133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		double avg = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += sc.nextInt();
		}
		
		avg = (double)sum / (double)num;
		System.out.println(Math.round(avg*100)/100.0);
	}
}
