package doit.chap02;
import java.util.Scanner;
// �� �迭�� �������� �Ǵ�

public class ArrayEqual {
	
	// �� �迭 a, b�� ��� ��Ұ� ������?
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)	// �� �迭�� ���̰� �ٸ��� �� �迭�� �ٸ� �迭�� Ȯ���ϹǷ� false ��ȯ
			return false;
		
		for(int i = 0; i < a.length; i++) {	// �� �迭�� ���̰� ���ٸ� �� �迭�� ��� ��Ҹ� �ϳ��� ���Ѵ�.
			if(a[i] != b[i])	// �� ����� ���� �ٸ��� false ��ȯ
				return false;
		}
		
		return true;	// ������ �ɸ��� �ʰ� �ڵ尡 ������ ����ƴٸ� �� �迭�� �����Ƿ� true ��ȯ
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 a�� ��ڼ� : ");
		int na = sc.nextInt();	// �迭 a�� ��ڼ�
		int[] a = new int[na];	// ��ڼ��� na�� �迭
		
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("�迭 b�� ��ڼ� : ");
		int nb = sc.nextInt();	// �迭 b�� ��ڼ�
		int[] b = new int[nb];	// ��ڼ��� nb�� �迭
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("�迭 a�� b�� " + (equals(a, b) ? "�����ϴ�." : "�ٸ��ϴ�."));
	}
}
