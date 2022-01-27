package doit.chap04;

public class Q4IntAryQueue {
	private int max;	// 큐 용량
	private int num;	// 현재 데이터 수
	private int[] que;	// 큐 본체
	
	// 실행 시 예외 : 큐가 비어 있음
	public class EmptyIntAryQueueException extends RuntimeException {
		public EmptyIntAryQueueException() {}
	}
	
	// 실행 시 예외 : 큐가 가득 참
	public class OverflowIntAryQueueException extends RuntimeException {
		public OverflowIntAryQueueException() {}
	}
	
	// 생성자
	public Q4IntAryQueue(int capacity) {
		int num = 0;
		int max = capacity;
		try {
			que = new int[max];			// 큐 본체용 배열 생성
		} catch (OutOfMemoryError e) {	// 생성 불가
			max = 0;
		}
	}
	
	// 큐에 데이터를 인큐
	public int enqueue(int x) throws OverflowIntAryQueueException {
		if (num >= max) 
			throw new OverflowIntAryQueueException();	// 큐가 가득 참
		return que[num++] = x;
	}
	
	// 디큐
	public int dequeue() throws EmptyIntAryQueueException {
		if (num < 0) 
			throw new EmptyIntAryQueueException();
		
		int front = que[0];
		
		for(int i = 1; i < num; i++) {
			que[i-1] = i;
		}
		return front;
	}
	
	// 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntAryQueueException {
		if (num < 0)
			throw new EmptyIntAryQueueException();
		return que[0];
	}
	
	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			if(que[i] == x) 
				return i;
		} 
		return -1;
	}
	
	// 큐를 비움
	public void clear() {
		num = 0;
	}
	
	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}
	
	// 큐가 비어 있나요?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	// 큐가 가득 찼나요?
	public boolean isFull() {
		return num >= max;
	}
	
	// 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
	public void dump() {
		if(num <= 0) 
			System.out.println("큐가 비어 있습니다.");
		for(int i = 0; i < num; i++) 
			System.out.print(que[i] + " ");
		System.out.println();
	}
}
