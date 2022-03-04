package baekjoon;

import java.util.Scanner;

public class Baekjoon17388 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int k = sc.nextInt();
		int h = sc.nextInt();
		
		if(s+k+h >= 100) {
			System.out.println("OK");
		} else {
			min(s, k, h);
		}
	}
	
	static void min(int s, int k, int h) {
		int min = s;
		String result = "Soongsil";
		
		if(min > k) {
			min = k;
			result = "Korea";
		}
		
		if(min > h) {
			min = h;
			result = "Hanyang";
		}
		
		System.out.println(result);
	}
}
