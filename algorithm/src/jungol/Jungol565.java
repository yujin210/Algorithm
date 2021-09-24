package jungol;

import java.util.Scanner;

public class Jungol565 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10]; // 0~99까지 십의 자리에 따라 담을 배열 
		
		while(true) {
			int num = sc.nextInt();
			if (num != 0) {
				arr[num / 10]++;
			} else {
				break; // 0 입력 시 반복문 종료
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(i + " : " + arr[i]);
			}
		}
	}
}
