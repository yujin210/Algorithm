/*
2021.09.16 �����
[�����ø��ǾƵ� �˰���] 562 : �迭1 - �ڰ�����8
http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=199&sca=1090 
---
���� )
10���� ������ �Է¹޾� �迭�� ������ �� ¦�� ��° �Էµ� ���� �հ� Ȧ�� ��° �Էµ� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
����� �ݿø��Ͽ� �Ҽ�ù°�ڸ����� ����Ѵ�.

�Է� �� )
95 100 88 65 76 89 58 93 77 99

��� �� )
sum : 446
avg : 78.8
*/
// ���� Ǯ�� �� ������ : �迭�� �ε��� ��ȣ�� �Էµ� ������ �ٸ� ���̴�. (�迭�� �ε����� 0���� ����������, 0�� �ε����� 1��°�� �Է� �� ���̴�.)
package array;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0; // ¦�� ��° �Է� �� ���� ����
		double avg = 0; // Ȧ�� ��° �Է� �� ���� ���� 

		for(int i=0; i<arr.length; i++) {
			if (i % 2 == 1) {
				sum += arr[i];
			} else {
				avg += arr[i];
			}
		}
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (avg/5));
	}
}