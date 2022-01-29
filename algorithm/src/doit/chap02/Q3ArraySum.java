package doit.chap02;
import java.util.Scanner;
import java.util.Random;

public class Q3ArraySum {
	static int sumOf(int[] a) {
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = 1 + rand.nextInt(10); // 1~10������ ����
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n���� ������ ��� ���� ���� �Ʒ��� �����ϴ�.");
		
		System.out.println(sumOf(arr));
	}
}
