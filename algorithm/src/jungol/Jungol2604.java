package jungol;

import java.util.Scanner;

public class Jungol2604 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String bowl = sc.next(); // ���ڿ� (�׸�) �Է�
		int height = 10; // �⺻ ������ ���� 10
		String[] arr = new String[bowl.length()];
		
 		for(int i = 0; i < bowl.length(); i++) {
			arr[i] = bowl.substring(i, i+1); // ���ڿ� �߶� �迭�� �ֱ�
		}
		
 		for (int i = 1; i < bowl.length(); i++) {
 			if (arr[i].equals(arr[i-1])) {
 				height += 5; 
 			} else {
 				height += 10;
 			}
 		}
 		System.out.println(height);
	}
}
