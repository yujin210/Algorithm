package jungol;

import java.util.Scanner;

public class Jungol115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][2];
		arr[0][0] = sc.nextInt(); // 민수 키
		arr[0][1] = sc.nextInt(); // 민수 몸무게
		arr[1][0] = sc.nextInt(); // 기영이 키
		arr[1][1] = sc.nextInt(); // 기영이 몸무게
		
		System.out.println(arr[0][0] > arr[1][0] && arr[0][1] > arr[1][1]);
	}
}
