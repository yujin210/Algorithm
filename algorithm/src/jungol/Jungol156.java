package jungol;

import java.util.Scanner;

public class Jungol156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100]; // �Է¹޴� ������ 100�� �����̹Ƿ� �迭 ũ�� 100���� ����
	
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) { // �迭�� ���� �Է�
			arr[i] = sc.nextInt(); // ���� ���ʷ� �Է� �ޱ�
			cnt++;
			if(arr[i] == 999) { // 999 �Է� �� �ݺ� ����
				break;
			} 
		} // end for
		
		int min = 998;
		int max = -999;
		for(int i = 0; i < cnt-1; i++) { // cnt�� 999�� �����ϹǷ� -1 �Ͽ� 999 ����
			if (arr[i] <= min) {
				min = arr[i];
			}
			
			if (max <= arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
