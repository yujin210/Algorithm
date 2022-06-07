package baekjoon;

import java.util.Scanner;

public class Baekjoon21612 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int B = sc.nextInt();
		
		int P = 5*B-400;
		
		System.out.println(P);
		System.out.println(P == 100 ? 0 : P > 100 ? -1 : 1);
	}
}