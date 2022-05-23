package baekjoon;

import java.util.Scanner;

public class Baekjoon4562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(x >= y ? "MMM BRAINS" : "NO BRAINS");
		}
	}
}