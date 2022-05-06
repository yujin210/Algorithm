package baekjoon;

import java.util.Scanner;

public class Baekjoon13752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int data = sc.nextInt();
			
			for(int j = 1; j <= data; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}
}