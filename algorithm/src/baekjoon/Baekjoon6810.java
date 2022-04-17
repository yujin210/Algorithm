package baekjoon;

import java.util.Scanner;

public class Baekjoon6810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num11 = sc.nextInt();
		int num12 = sc.nextInt();
		int num13 = sc.nextInt();
		int result = 0;
		
		int[] isbn = {9, 7, 8, 0, 9, 2, 1, 4, 1, 8, num11, num12, num13};
		
		for(int i = 0; i < isbn.length; i++) {
			if(i % 2 == 0) 
				result += isbn[i]*1;
			else
				result += isbn[i]*3;
		}
		
		System.out.printf("The 1-3-sum is %d", result);
	}
}