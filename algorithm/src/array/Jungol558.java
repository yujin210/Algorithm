/*
2021.09.17 �ݿ���
[�����ø��ǾƵ� �˰���] 558 : �迭1 - �ڰ�����4
http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=195&sca=1090
---
���� )
100 ���� ������ ������ �� �ִ� �迭�� �����ϰ� ������ ���ʷ� �Է¹޴ٰ� 0 �� �ԷµǸ� 0 �� �����ϰ� �� ������ �Էµ� ������ ���� ���߿� �Էµ� �������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է� �� )
3 5 10 55 0

��� �� )
55 10 5 3
*/
package array;

import java.util.Scanner;

public class Jungol558 {
	public static void main(String[] args) {
		int[] arr = new int[100]; // 100���� ���� ������ �� �ִ� �迭 ����
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			cnt++;  
			
			if(arr[i] == 0) { 
				break; // �Էµ� ���� 0�̸� �迭 �� ���� �ߴ�
			}
		}
		
		for(int i = cnt-2; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
	}
}
