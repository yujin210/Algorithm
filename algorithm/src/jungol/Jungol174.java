package jungol;

import java.util.Scanner;

public class Jungol174 {
	public static void main(String[] args) {
		score();
	}
	
	static void score() {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
					arr[i][j] = sc.nextInt();					
			}
		}
		
		arr[0][3] = arr[0][0] + arr[0][1] + arr[0][2];
		arr[1][3] = arr[1][0] + arr[1][1] + arr[1][2];
		arr[2][3] = arr[2][0] + arr[2][1] + arr[2][2];
		
		arr[3][0] = arr[0][0] + arr[1][0] + arr[2][0];
		arr[3][1] = arr[0][1] + arr[1][1] + arr[2][1];
		arr[3][2] = arr[0][2] + arr[1][2] + arr[2][2];
		arr[3][3] = arr[3][0] + arr[3][1] + arr[3][2];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
