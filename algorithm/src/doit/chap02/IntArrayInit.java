package doit.chap02;
// ���� �ڷ����� int���� �迭(���� ��ڼ��� 5 : �迭 �ʱ��ڿ� ���� ����)

public class IntArrayInit {
	public static void main(String[] args) {
		//int[] a = {1, 2, 3, 4, 5};	// �迭 �ʱ��ڿ� ���� ���� (1�� ���)
		int[] a = new int[] {1, 2, 3, 4, 5};
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
