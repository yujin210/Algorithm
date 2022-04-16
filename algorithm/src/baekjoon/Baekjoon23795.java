package baekjoon;

import java.util.Scanner;

public class Baekjoon23795 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int total = 0;
		while(money != -1) {
			total += money;
			money = sc.nextInt();
		}
		
		System.out.println(total);
	}
}