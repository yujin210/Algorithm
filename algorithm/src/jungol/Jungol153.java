package jungol;

import java.util.Scanner;

public class Jungol153 {
	public static void main(String[] args) {
		int[] arr = new int[100]; // 100���� ������ �Է¹��� �� �ִ� �迭
		int num = 0; // �Է� ���� ���� �ε����� �����ϱ� ���� ����
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			num = i; // �ε��� ���� (-1�� �ԷµǾ �ε��� ������)
			if (arr[i] == -1) {
				break;
			}
		}
		
		if (num <= 2) { // -1�� �����ϰ� �Է¹��� ������ 3�� �̸��� ���
			for(int i = 0; i <= num-1; i++) {
				System.out.printf("%d ", arr[i]); // -1 �����ϰ� �Է¹��� ���� ��� ���
			}
		} else {
			for(int j = (num-3); j <= (num-1); j++) { // -1�� ������ ������ �� ���� ���� ���
				System.out.printf("%d ", arr[j]);
			}
		}
	}
}
