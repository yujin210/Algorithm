package jungol;

import java.util.Scanner;

public class Jungol560 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int min = 1000;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println(min);
	}
}
