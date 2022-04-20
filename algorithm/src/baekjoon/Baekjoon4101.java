package baekjoon;

import java.util.Scanner;

public class Baekjoon4101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		while(num1 != 0 && num2 != 0) {
			System.out.println(num1 > num2 ? "Yes" : "No");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		}
	}
}