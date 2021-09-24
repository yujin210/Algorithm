package jungol;

import java.util.Scanner;

public class Jungol537 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		while(num >= 1) {
			sum += num;
			num--;
		}
		
		System.out.println(sum);
	}

}
