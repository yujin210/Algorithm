package baekjoon;

import java.util.Scanner;

public class Baekjoon14405 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		s = s.replaceAll("pi|ka|chu", "");
		
		System.out.println(s.length() == 0 ? "YES" : "NO");
	}
}