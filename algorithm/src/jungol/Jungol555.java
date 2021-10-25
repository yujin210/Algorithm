package jungol;

import java.util.Scanner;

public class Jungol555 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = new char[10];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
			System.out.print(arr[i]);
		}
	}
}
