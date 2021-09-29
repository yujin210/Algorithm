package jungol;

import java.util.Scanner;

public class Jungol569 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][4];
		int sum = 0;
		int passCnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
			if (sum / arr[i].length >= 80) {
				System.out.println("pass");
				passCnt++;
			} else {
				System.out.println("fail");
			}
			sum = 0; // 한 행의 반복이 종료되는 시점에 sum을 0으로 초기화 시켜준다.
		}
		System.out.println("Successful : " + passCnt);
	}
}
