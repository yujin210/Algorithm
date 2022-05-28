package baekjoon;

import java.util.Scanner;

public class Baekjoon6749 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int young = sc.nextInt();
		int middle = sc.nextInt();
		int gap = middle - young;
		
		System.out.println(middle + gap);
	}
}