package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class Baekjoon20115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] drinks = new int[n];
		double result = 0;
		
		for(int i = 0; i < n; i++) {
			drinks[i] = sc.nextInt();
		}
		
		Arrays.sort(drinks);
		
		result = drinks[n-1];
		
		for(int i = 0; i < n-1; i++) { // 양이 제일 많은 마지막 드링크는 놔둘 것이므로 -1
			result += (double) drinks[i]/2;
		}
		
		System.out.println(result);
	}
}