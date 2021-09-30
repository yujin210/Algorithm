package jungol;

import java.util.Scanner;

public class Jungol566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100]; // 배열의 크기 고민...
		arr[0] = 100;
		arr[1] = sc.nextInt();
		
		System.out.print(arr[0] + " " + arr[1] + " ");
		
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-2] - arr[i-1];
			if(arr[i] >= 0) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.print(arr[i] + " ");				
				break;
			}
		} 
	}
}
