package jungol;

import java.util.Scanner;

public class Jungol549 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		int odd = -1;
		int cnt = 0;
		
		while(sum < num) {
			odd += 2;
			sum += odd;
			cnt++;
		}
		System.out.println(cnt + " " + sum);
	}
}
