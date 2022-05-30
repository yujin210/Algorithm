package baekjoon;

import java.util.Scanner;

public class Baekjoon20492 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int reward = sc.nextInt();
		
		System.out.println(reward*78/100);
		System.out.println(reward*80/100 + reward*20/100*78/100);
	}
}