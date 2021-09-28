package jungol;

import java.util.Scanner;

public class Jungol164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][3]; // 2차원 배열 선언
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "class? ");
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
			System.out.println((i+1) + "class : " + sum);
			sum = 0;
		}
	}
}

/*
 * 문제에서 요구하는 출력 값 맞추기 위한 코드
import java.util.Scanner;

public class Jungol164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][3]; // 2차원 배열 선언
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "class ? ");
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
			System.out.println((i+1) + "class : " + sum);
			sum = 0;
		}
	}
}  
*/
