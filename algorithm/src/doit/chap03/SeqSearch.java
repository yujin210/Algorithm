package doit.chap03;
import java.util.Scanner;
// ���� �˻�

public class SeqSearch {
	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��մϴ�.
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		// å���� �����ϴ� �迭 �˻��� ���� ������ �� �����̴�.
		// 1. �˻��� ���� �߰����� ���ϰ� �迭�� ���� ������ ���
		// 2. �˻��� ���� ���� ��Ҹ� �߰��� ���
		
		// ���� ��� 1 : while ���
		while(true) {
			if(i == n)		// 1���� �ش� (i�� 0���� �����̰�, n�� �ε����� ���� �ƴ� �迭 ũ���� ���̱� ������ (i == n)�� �����ϴ� ���� ã�� ���� �迭�� �������� �ʾ� n+1�� �ݺ����� ���̴�.) 
				return -1;	// �˻� ���� (-1�� ��ȯ)
			
			if(a[i] == key)	// 2���� �ش� 
				return i;	// �˻� ���� (�ε����� ��ȯ)
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num]; // ��ڼ��� num���� �迭 x ����
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int key = sc.nextInt();
		
		int idx = seqSearch(x, num, key);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else 
			System.out.println(key + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
		
	}
}
