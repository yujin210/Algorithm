package baekjoon;

import java.util.Scanner;

public class Baekjoon2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[10]; // 0~9�� �ش��ϴ� �� ������ �迭

		String mul = Integer.toString(a*b*c); // a*b*c�� ���� ���ڿ� Ÿ������ ����
		for(int i = 0; i < mul.length(); i++) {
			char num = mul.charAt(i); // ���ڿ� Ÿ���� charAt() �޼��� ����Ͽ� ���� Ÿ������ ��ȯ
			arr[num - '0']++; // �ƽ�Ű �ڵ� Ȱ���Ͽ� ��ȯ��Ų ���� �ش��ϴ� �迭�� �־���
			num = 0;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
