package jungol;

import java.util.Scanner;

public class Jungol565 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10]; // 0~99���� ���� �ڸ��� ���� ���� �迭 
		
		while(true) {
			int num = sc.nextInt();
			if (num != 0) {
				arr[num / 10]++;
			} else {
				break; // 0 �Է� �� �ݺ��� ����
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(i + " : " + arr[i]);
			}
		}
	}
}
