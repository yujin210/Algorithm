package jungol;

import java.util.Scanner;

public class Jungol1303 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // ����
		int m = sc.nextInt(); // �ʺ�
		int num = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.printf("%d ", ++num);
			}
			System.out.println();
		}
	}
}
