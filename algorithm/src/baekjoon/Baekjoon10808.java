package baekjoon;

import java.util.Scanner;

public class Baekjoon10808 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] result = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			result[s.charAt(i)-97]++;
		}
		
		for(int i : result) {
			System.out.print(i + " ");
		}
	}
}
