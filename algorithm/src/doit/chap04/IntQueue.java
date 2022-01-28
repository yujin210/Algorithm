package doit.chap04;
// int�� ť

public class IntQueue {
	private int max;	// ť�� �뷮
	private int front;	// ù ��° ��� Ŀ�� : ��ť�ϴ� ù ��° �������� �ε��� ����
	private int rear;	// ������ ��� Ŀ�� 	: (���� �������� ��ť�ϴ� �������� �ε��� + 1) ��° �ε����� ���� (���� ��ť�ÿ� �����Ͱ� ����� �ε����� �̸� �غ�)
	private int num;	// ���� ������ ��   : front�� rear�� ���� ���� ��, ť�� ����ִ���, ���� á���� �����ϱ� ���� ����
	private int[] que;	//  ť ��ü
	
	// ���� �� ���� : ť�� ��� ����
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	// ���� �� ���� : ť�� ���� ��
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	// ������
	public IntQueue(int capacity) {
		num = front = rear = 0;			// ó������ ť�� ��������Ƿ� num, front, rear ���� ��� 0���� ����
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;					// �迭 ��ü ���� ���� ��, �ٸ� �޼��尡 �������� �ʴ� �迭�� �����ϴ� ���� ���� ���� max�� 0���� ����
		}
	}
	
	// ť�� �����͸� ��ť
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max) 
			throw new OverflowIntQueueException();	// ť�� ���� ��
		que[rear++] = x;							// ������ ��ť ��, rear �� 1 ����
		num++;										// ������ ��ť ��, num �� 1 ����
		if (rear == max)							// rear�� max�� ���� ������ ���
			rear = 0;								// rear�� ���� 0���� �����Ͽ� rear�� max�� ������ ����� ���� �����Ѵ�.
		return x;									// ��ť ���� �� ��ť�� ���� �״�� ��ȯ
	}
	
	// ť�� �����͸� ��ť
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();		// ť�� ��� ����
		int x = que[front++];						// ������ �����͸� ���� ��, front�� �� 1 ����
		num--;										// ������ �����͸� ���� ��, num �� 1 ����
		if (front == max)							// front�� max�� ���� ������ ���
			front = 0;								// front�� ���� 0���� �����Ͽ� front�� max�� ������ ����� ���� �����Ѵ�.
		return x;									// ��ť ���� �� ��ť�� ���� ��ȯ
	}
	
	// ť���� �����͸� ��ũ(����Ʈ �����͸� �鿩�ٺ�)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();	// ť�� ��� ����
		return que[front];						// �ܼ��� ����Ʈ �����͸� Ȯ�θ� �ϴ� ���̱� ������ front�� ���� ������ �ʴ´�.
	}
	
	// ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) { 	
			int idx = (i + front) % max;	// ������ ť�� ��� front ���� ���ϹǷ� �̿� ���� ���� ����Ѵ�.
			// front ��ġ ���� + i �� ��ȭ => �ε��� ������Ű�鼭 �˻�. �̶� ���ϱ⸸ �ϸ� max�� ������ �Ѿ�Ƿ� max�� ���� �������� ���� (front+i)==max�� �Ǵ� ���� �ٽ� 0���� �����ϵ��� �Ѵ�.
			if (que[idx] == x)				// �˻� ����
				return x;
		}
		return -1;							// �˻� ����
	}
	
	// ť�� ���
	public void clear() {
		front = rear = num = 0;
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
		if (num <= 0)
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		else {
			for(int i = 0; i < num; i++)
				System.out.print(que[(front+i) % max] + " ");
			System.out.println();		
		}
	}
	
}
