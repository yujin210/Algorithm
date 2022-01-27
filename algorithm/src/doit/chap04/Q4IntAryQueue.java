package doit.chap04;

public class Q4IntAryQueue {
	private int max;	// ť �뷮
	private int num;	// ���� ������ ��
	private int[] que;	// ť ��ü
	
	// ���� �� ���� : ť�� ��� ����
	public class EmptyIntAryQueueException extends RuntimeException {
		public EmptyIntAryQueueException() {}
	}
	
	// ���� �� ���� : ť�� ���� ��
	public class OverflowIntAryQueueException extends RuntimeException {
		public OverflowIntAryQueueException() {}
	}
	
	// ������
	public Q4IntAryQueue(int capacity) {
		int num = 0;
		int max = capacity;
		try {
			que = new int[max];			// ť ��ü�� �迭 ����
		} catch (OutOfMemoryError e) {	// ���� �Ұ�
			max = 0;
		}
	}
	
	// ť�� �����͸� ��ť
	public int enqueue(int x) throws OverflowIntAryQueueException {
		if (num >= max) 
			throw new OverflowIntAryQueueException();	// ť�� ���� ��
		return que[num++] = x;
	}
	
	// ��ť
	public int dequeue() throws EmptyIntAryQueueException {
		if (num < 0) 
			throw new EmptyIntAryQueueException();
		
		int front = que[0];
		
		for(int i = 1; i < num; i++) {
			que[i-1] = i;
		}
		return front;
	}
	
	// ť���� �����͸� ��ũ(����Ʈ �����͸� �鿩�ٺ�)
	public int peek() throws EmptyIntAryQueueException {
		if (num < 0)
			throw new EmptyIntAryQueueException();
		return que[0];
	}
	
	// ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			if(que[i] == x) 
				return i;
		} 
		return -1;
	}
	
	// ť�� ���
	public void clear() {
		num = 0;
	}
	
	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	// ť�� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return num;
	}
	
	// ť�� ��� �ֳ���?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	// ť�� ���� á����?
	public boolean isFull() {
		return num >= max;
	}
	
	// ť ���� ��� �����͸� ����Ʈ -> ���� ������ ���
	public void dump() {
		if(num <= 0) 
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		for(int i = 0; i < num; i++) 
			System.out.print(que[i] + " ");
		System.out.println();
	}
}
