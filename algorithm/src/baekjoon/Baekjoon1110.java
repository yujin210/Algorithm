package baekjoon;

import java.util.Scanner;

public class Baekjoon1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cycle = 0;
		int num1 = 0;		
		int left = 0; // ���� ���� 1�� �ڸ�
		int right = 0; // ���� �Է� �Ǵ� ���� 1�� �ڸ�
		int sum = 0;
		
		num1 = sc.nextInt(); // ù ��° �Է�
		if (num1 < 10) { // �־��� ���� 10���� ������ 
			left = 0; // �տ� 0�� ���δ�.
			right = num1; 
			sum = left + right; // �� �ڸ� ���� ���Ѵ�.
		} else {
			left = num1 / 10;
			right = num1 % 10;
			sum = left + right;
		}
		cycle++;
		
		while(true) {
			int num2 = (left*10) + right;
			if(num2 < 10) {
				left = num2; // �־��� ���� ���� ������ �ڸ� ��
				right = sum % 10; // �տ��� ���� ���� ���� ������ �ڸ� ��
				sum = left + right;
				
				if ((left*10) + right == num1) {
					break;
				}
				cycle++;
			} else {
				left = num2 % 10;
				right = sum % 10;
				sum = left + right;
				
				if ((left*10) + right == num1) {
					break;
				}
				cycle++;
			}
		}
		
		System.out.println(cycle);
		
	}

}		


