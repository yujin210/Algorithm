package jungol;

import java.util.Scanner;

public class Jungol140 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int cnt = 0;
		
		for(int i = 1; i <= 20; i++) {
			num = sc.nextInt();
			if (num == 0) {
				break;
			} else {
				sum += num;
				cnt++;
			}
		}
		
		System.out.println(sum + " " + sum/cnt);
	}
}
