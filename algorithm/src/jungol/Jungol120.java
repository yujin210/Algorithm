package jungol;

import java.util.Scanner;

public class Jungol120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt();
		int num = sc.nextInt();
		int max = 0;
		
		if(min >= num) {
			max = min;
			min = num;
		} else {
			max = num;
		}
		
		System.out.println(max-min);
	}
}
