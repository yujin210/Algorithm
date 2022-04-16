package baekjoon;

import java.util.Scanner;

public class Baekjoon24568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int s = sc.nextInt();
		int total = (8*r)+(3*s);
		
		System.out.println(total-28);
	}
}