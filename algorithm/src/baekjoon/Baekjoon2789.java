package baekjoon;

import java.util.Scanner;

public class Baekjoon2789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String email = sc.next();
		String regex = "[CAMBRIDGE]+";
		String result = "";
		
		result = email.replaceAll(regex, "");
		
		System.out.println(result);
	}
}