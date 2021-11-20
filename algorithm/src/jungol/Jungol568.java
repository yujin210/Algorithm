package jungol;

import java.util.Scanner;

public class Jungol568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr1 = new int[2][4];
		int[][] arr2 = new int[2][4];
		
		System.out.println("first array");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("second array");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.printf("%d ", arr1[i][j]*arr2[i][j]);
			}
			System.out.println();
		}
	}
}
