package doit.chap03;
import java.util.Scanner;
// ���� �˻� (���ʹ�)

public class SeqSearchSen {

	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻��մϴ�.
	// ���ʹ� : �˻��ϱ� ���� ã���� �ϴ� Ű ���� �� �� ��ҿ� �����Ͽ�, ���ϴ� ���� ������ �����Ϳ� �������� �ʾƵ� ���ʱ��� �˻��ϸ� �˻��� �����ϴ� ���̴�. -> ���� �Ǵ� Ƚ���� ���� �� �ִ� ������ �ִ�.
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;	// ���ʸ� �߰�
		
		while(true) {
			if (a[i] == key)	// �˻� ����
				break;
			i++;
		}
		return i == n ? -1 : i;	// i���� n�̸� ã�� ���� �����̹Ƿ� �˻� �������� ��Ÿ���� -1 ��ȯ (i�� ��ġ���� �����ڸ� ����Ͽ��� ������ n�� ũ��� �񱳰� �����ϴ�.)
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num+1];		// ��ڼ� num + 1
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");	// Ű ���� �Է�
		int key = sc.nextInt();
		
		int idx = seqSearchSen(x, num, key);	// �迭 x���� ���� key�� ��Ҹ� �˻�
		
		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else 
			System.out.println(key + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
