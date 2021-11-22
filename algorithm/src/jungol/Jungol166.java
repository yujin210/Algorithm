package jungol;

import java.util.Scanner;

public class Jungol166 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr1 = new int[2][3];
		int[][] arr2 = new int[2][3];
		int[][] arr3 = new int[2][3];
		
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
				arr3[i][j] = arr1[i][j] * arr2[i][j];
			}
		}
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
