package jungol;

import java.util.Scanner;

public class Jungol539 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		
		while(true) {
			int num = sc.nextInt();
			cnt++; // 마지막 입력된 수 (100 이상)도 포함이기 때문에 cnt 위치가 if문에 안걸리게 설정함.
			if (num < 100) {
				sum += num;
			} else {
				sum += num;
				break;
			}
		}
		
		avg = (double) sum / (double) cnt;
		System.out.println(sum);
		System.out.println(Math.round(avg*10)/10.0);
			
	}
}
