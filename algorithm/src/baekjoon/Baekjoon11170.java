package baekjoon;

import java.util.Scanner;

public class Baekjoon11170 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int t = sc.nextInt();
		
		for(int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			for(int j = n; j <= m; j++) {
				int temp = j;
				
				while(temp != 0) {
					if(temp%10 == 0) {
						count++;
					}
					temp /= 10;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}
