package baekjoon;

import java.util.Scanner;

public class Baekjoon5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		total = 1000-total;
		int[] coin = {500, 100, 50, 10, 5, 1};
		int answer = 0;
		int idx = 0;
		
		while(total != 0) {
			if(coin[idx] <= total) {
				total -= coin[idx];
				answer++;
			} else {
				idx++;
			}
		}
		
		System.out.println(answer);
	}
}
