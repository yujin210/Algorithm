package jungol;

import java.util.Arrays;
import java.util.Scanner;

public class Jungol159 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] arr = new int[num]; // �Է¹��� ���� ũ���� �迭 ����
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = num-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
