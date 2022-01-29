package doit.chap03;
import java.util.Scanner;
// ���� �˻�

public class BinSearch {
	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻�
	static int binSearch(int[] a, int n, int key) {
		int pl = a[0];		// �˻� ������ ù �ε���
		int pr = n-1;		// �˻� ������ �� �ε���
		
		do {
			int pc = (pl + pr) / 2; // �߾� ����� �ε���
			if(a[pc] == key)
				return pc;	// �˻� ����
			else if (a[pc] < key)
				pl = pc+1;	// �˻� ������ ���� �������� ����
			else
				pr = pc-1;	// �˻� ������ ���� �������� ����
		} while (pl <= pr); // �˻� ������ ������ �ݺ��� ����
		
		return -1;	// �˻� ����	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.print("x[0] : ");	// ù ��� �Է�
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while(x[i] < x[i-1]);	// �ٷ� ���� ��Һ��� ������ �ٽ� �Է�
		}
		
		System.out.print("�˻��� �� : ");	// Ű ���� �Է�
		int key = sc.nextInt();
		
		int idx = binSearch(x, num, key); // �迭 x���� Ű ���� key�� ��Ҹ� �˻�
		
		if(idx == -1)
			System.out.println("ã�� ���� �迭�� �������� �ʽ��ϴ�.");
		else 
			System.out.println(key + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
