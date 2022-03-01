package baekjoon;

import java.util.Scanner;

public class Baekjoon2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int repeat = sc.nextInt();
			String str = sc.next();
			System.out.println(newString(repeat, str));
		}
	}
	
	static String newString(int repeat, String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 1; j <= repeat; j++) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}
}
