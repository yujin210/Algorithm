package baekjoon;

import java.util.Scanner;

public class Baekjoon2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num = 0;
		
		for(int i = 0; i < 5; i++) {
			num = sc.nextInt();
			sum += Math.pow(num, 2);
		}
		
		System.out.println(sum%10);
	}
}
