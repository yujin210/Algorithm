package baekjoon;

import java.util.Scanner;

public class Baekjoon11006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int leg = sc.nextInt();
			int chicken = sc.nextInt();
			int intact = chicken*2-leg;
			System.out.println(intact + " " + (chicken-intact));
		}
	}
}