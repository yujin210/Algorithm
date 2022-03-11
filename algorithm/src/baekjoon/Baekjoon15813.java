package baekjoon;

import java.util.Scanner;

public class Baekjoon15813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String name = sc.next();
		int score = 0;
		
		for(int i = 0; i < n; i++) {
			int ch = name.charAt(i)-64;
			score += ch;
		}
		
		System.out.println(score);
	}
}
