package baekjoon;

import java.util.Scanner;

public class Baekjoon2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		int seq = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
				seq = i+1;
			}
		}
		System.out.println(max);
		System.out.println(seq);
	}
}
