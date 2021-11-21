package jungol;

import java.util.Scanner;

public class Jungol169 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] arr = new char[3][5];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print((char)(arr[i][j]+32) + " "); // 소문자는 대문자보다 32가 더 크므로, 입력 받은 값에 32를 더하여 문자형으로 출력한다.
			}
			System.out.println();
		}
	}
}
