package jungol;

import java.util.Scanner;

public class Jungol164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][3]; // 2���� �迭 ����
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
 * �������� �䱸�ϴ� ��� �� ���߱� ���� �ڵ�
import java.util.Scanner;

public class Jungol164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][3]; // 2���� �迭 ����
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
