package baekjoon;

import java.util.Scanner;

public class Baekjoon1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // �������
		int b = sc.nextInt(); // �������
		int c = sc.nextInt(); // �ǸŰ�
		
		int count = 0; 		  // ���� ������ �߻��ϴ� �Ǹŷ� (���ͺб���)
		
		if(b >= c) {
			count = -1;
		} else {
			while((c-b)*count <= a) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
