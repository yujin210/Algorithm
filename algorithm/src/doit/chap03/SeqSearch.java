package doit.chap03;
import java.util.Scanner;
// ���� �˻�

public class SeqSearch {
	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��մϴ�.
	static int seqSearch(int[] a, int key) {
		for(int i = 0; i < a.length; i++) {
			if(key == a[i])
				return i;
		}
		
		return -1;
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
		
		if(seqSearch(x, key) == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else 
			System.out.println(key + "��(��) x[" + seqSearch(x, key) + "]�� �ֽ��ϴ�.");
		
	}
}
