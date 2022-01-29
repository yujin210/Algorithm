package doit.chap02;
import java.util.Scanner;
import java.util.Random;
// �迭 ��Ҹ� �������� �����ϴ� ������ �ϳ��� ��Ÿ���� ���α׷� �ۼ�

public class Q2ReverseArray {
	// �迭�� ��Ҹ� �ٲٴ� �޼���
	static void swap(int[] x, int idx1, int idx2) {
		int temp = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = temp;
	}
	
	// �迭�� �������� �����ϴ� �޼���
	static void reverse(int[] x) {
		for(int i = 0; i < x.length/2; i++) {
			System.out.println("a[" + i + "]��(��) a[" + (x.length-i-1) + "]�� ��ȯ�մϴ�.");
			swap(x, i, x.length-i-1);
			
			for(int j = 0; j < x.length; j++) {
				System.out.print(x[j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		
		int[] array = new int[num];
		
		for(int i = 0; i < num; i++) {
			array[i] = 1 + rand.nextInt(100); // �迭 ����� ���� 1~100������ ������ ����
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		reverse(array);	
	}
}
