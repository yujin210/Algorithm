package baekjoon;

import java.util.Scanner;

public class Baekjoon3046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r1 = sc.nextInt();
		int s = sc.nextInt();
		
		int r2 = ((2*s)-r1);
		
		System.out.println(r2);
	}
}
