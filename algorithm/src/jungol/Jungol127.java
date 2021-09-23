package jungol;

import java.util.Scanner;

public class Jungol127 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		
		while (true){
			int num = sc.nextInt();
			if(0 <= num && num <= 100) {
				sum += num;
				cnt++;
			} else {
				break;
			}
		}
		
		avg = (double)sum / (double)cnt;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + Math.round(avg*10)/10.0);
	}

}
