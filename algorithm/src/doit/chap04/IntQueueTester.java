package doit.chap04;

import java.util.Scanner;

// int�� ť�� ��� ��

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue s = new IntQueue(64);	// �ִ� 64���� ��ť�� �� �ִ� ť
		
		while(true) {
			System.out.println("���� ������ �� : " + s.size() + "/" + s.capacity());
			System.out.print("(1)��ť (2)��ť (3)��ũ (4)���� (0)���� : ");
			
			int menu = sc.nextInt();
		
			if (menu == 0)
				break;
			
			switch(menu) {
				case 1:
					System.out.print("������ : ");
					int x = sc.nextInt();
					try {
						s.enque(x);
					} catch (IntQueue.OverflowIntQueueException e) {
						System.out.println("ť�� ���� á���ϴ�.");
					}
					break;
					
				case 2:
					try {
						x = s.deque();
						System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("ť�� ��� �ֽ��ϴ�.");
					} 
					break;
					
				case 3:
					try {
						x = s.peek();
						System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("ť�� ��� �ֽ��ϴ�.");
					}
					break;
					
				case 4:
					s.dump();
					break;
			}
		}
	}
}

