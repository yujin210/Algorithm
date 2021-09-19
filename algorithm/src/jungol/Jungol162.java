package jungol;

import java.util.Scanner;

public class Jungol162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		int sum = 0;
		int digit = 0;
		
		for(int i = 2; i < arr.length; i++) {
			sum = arr[i-1] + arr[i-2]; 
			if (sum >= 10) {
				digit = sum % 10;
				arr[i] = digit;
			} else {
				arr[i] = sum;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
