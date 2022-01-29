package doit.chap02;
import java.util.Scanner;
// �迭 ��ҿ� ���� �о� �鿩 �������� �����մϴ�.

public class ReverseArray {
	// �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ�
	static void swap(int[] a, int idx1, int idx2) {	  // �̶� �Ű������� 3���� �ʿ��ϴ�. 
		// (1. �迭 ��ü�� �����ϴ� �迭 ����(������ �迭�� ��Ұ� � ������ �˱� ����), 2. ���� ��ȯ�� �ε���1, 3. ���� ��ȯ�� �ε���2
		// �迭 ������ Ÿ���� int[], �ε����� �׳� ���� int�� Ÿ������ ����ϸ� �ȴ�.

		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	// �迭 a�� ��Ҹ� �������� ����
	static void reverse(int[] a) {	  // �迭�� �������� �����ϴ� �޼���
		// ���� ������ �迭 ������ ���� ���� �ٲ��ָ� �ȴ�.(ũ�Ⱑ 5�� ���, 0�� �ε��� - 4�� �ε���, 1�� �ε��� - 3�� �ε��� => ��ȯ �� �ε��� ���� : 4 3 2 1 0 )  
		for(int i = 0; i < (a.length/2); i++) { // �迭�� ũ�Ⱑ Ȧ���� ��� ��� ���� �ٲ����� �ʾƵ� �ǹǷ� "ũ��/2"�� ����� �� ���Ѵ�. 
			swap(a, i, a.length-i-1);			// ���� �ٲ� �ε����� ���ϴ� ���� a.length-i-1�̴�. �ε����� 0���� �����ϹǷ� 1�� ���ִ� ���̴�.
			
			//swap(a, a[i], a[a.length-i-1]);	// �̷��� ������ �ȵȴ�. 
			//ó���� �ڵ带 �ۼ��� �� �ߴ� �Ǽ��ε�, �̷��� �Ǹ� swap�� �Ű������� '�ε��� ��'�� �ƴ϶� '�ش� �ε����� ����� ��'�� �Ű������� �Ѿ�� �ε����� ������ ����� ������ �߻��Ѵ�.
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();	// ��ڼ�
		
		int[] x = new int[num]; 	// ��ڼ��� num�� �迭
				
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);		// �迭 a�� ��Ҹ� �������� ����
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
