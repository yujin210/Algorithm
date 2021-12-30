package jungol;

import java.util.Scanner;

public class Jungol1307 {
	public static void main(String[] args) {
		fill();
	}
	
	static void fill() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] arr = new char[n][n];
		char ch = 'A';
		
	
		for(int i = arr.length-1; i >= 0; i--) { 
			for(int j = arr.length-1; j >= 0; j--) {
				if(ch == '[') {
					ch = 'A';
				}
				arr[j][i] = ch++;
			} 
		}
		 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
