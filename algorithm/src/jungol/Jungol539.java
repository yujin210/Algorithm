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
			cnt++; // ������ �Էµ� �� (100 �̻�)�� �����̱� ������ cnt ��ġ�� if���� �Ȱɸ��� ������.
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
