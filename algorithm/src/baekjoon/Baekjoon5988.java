package baekjoon;

import java.util.Scanner;

public class Baekjoon5988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String num = sc.next();
			int temp = num.charAt(num.length()-1)-'0';
			if(temp % 2 == 0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
	}
}