package doit.chap04;

import java.util.Scanner;

public class Q1IntStackTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("���� ������ �� : " + s.size() + " / " + s.capacity());
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)�˻� (6)���_���� (7)����_�뷮_Ȯ�� (8)����_������_��_Ȯ�� (9)isEmpty (10)isFull (0)���� : ");
			
			int menu = sc.nextInt();
			
			if (menu == 0) break;
			
			int x;
			switch(menu) {
				case 1:		// Ǫ��
					try {
						System.out.print("������ : ");
						x = sc.nextInt();
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("������ ���� á���ϴ�.");
					}
					break;
					
				case 2:		// ��
					try {
						x = s.pop();
						System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("������ ��� �ֽ��ϴ�.");
					}
					break;
					
				case 3:		// ��ũ
					try {
						x = s.peek();
						System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("������ ��� �ֽ��ϴ�.");
					}
					break;
					
				case 4:		// ����
					s.dump();
					break;
					
				case 5:		// �˻�
					System.out.print("�˻��� ������ : ");
					x = sc.nextInt();
					int result = s.indexOf(x);
					if (result == -1) 
						System.out.println("ã�� �����Ͱ� ���ÿ� �������� �ʽ��ϴ�.");
					else 
						System.out.println("ã�� �����ʹ� " + result + "�� �ε����� �ֽ��ϴ�.");
					break;
					
				case 6:		// ��� ����
					s.clear();
					System.out.println("������ ��� ������ϴ�.");
					break;
					
				case 7:		// ���� �뷮 Ȯ��
					x = s.capacity();
					System.out.println("������ ũ��� " + x + "�Դϴ�.");
					break;
					
				case 8:		// ���� ������ �� Ȯ��
					x = s.size();
					System.out.println("���ÿ� ���� �������� ���� " + x + "�� �Դϴ�.");
					break;
					
				case 9:		// isEmpty
					System.out.println("isEmpty? : " + s.isEmpty());
					break;
					
				case 10: 	// isFull
					System.out.println("isFull? : " + s.isFull());
					break;
					
				default : 
					System.out.println("�߸��� �����Դϴ�.");
			}
		}
	}
}
