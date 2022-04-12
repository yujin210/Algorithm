package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arrA = new int[n];
		Integer[] arrB = new Integer[n];
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			arrA[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			arrB[i] = sc.nextInt();
		}
		
		Arrays.sort(arrA);
		Arrays.sort(arrB, Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			answer += arrA[i]*arrB[i];
		}
		
		System.out.println(answer);
	}
}