package jungol;

import java.util.Scanner;

public class Jungol167 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[4][2];

		int[] row = new int[4];
		int total = 0;
		int rsum = 0;
		int csum0 = 0;
		int csum1 = 0;

		for (int i = 0; i < arr.length; i++) { // �迭�� �� �Է¹ޱ�
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				rsum += arr[i][j];
				total += arr[i][j];
				if (j == 0) {
					csum0 += arr[i][j];
				} else {
					csum1 += arr[i][j];
				}
			}
			row[i] = rsum / arr[i].length;
			rsum = 0; // �� �ʱ�ȭ
			
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(row[i] + " "); // �� ��� ���
		}
		System.out.println();
		
		System.out.print(csum0 / 4 + " ");
		System.out.println(csum1 / 4);
		
		System.out.println(total / 8); // ��� �� ��� ���
	}
}
