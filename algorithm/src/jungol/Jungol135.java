package jungol;

import java.util.Scanner;

public class Jungol135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		if (num1 > num2) {
			for(int j = num2; j <= num1; j++) {
				if(j % 3 == 0 || j % 5 == 0) {
					sum += j;
					cnt++;
				}
			}
		} else {
			for(int i = num1; i <= num2; i++) {
				if(i % 3 == 0 || i % 5 == 0) {
					sum += i;
					cnt++;
				}
			}		
		}
		
		avg = (double) sum / (double) cnt;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + Math.round(avg*10)/10.0);
	}
}
