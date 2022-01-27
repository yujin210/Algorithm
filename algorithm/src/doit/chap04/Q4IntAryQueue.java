package doit.chap04;
// int형 큐(링 버퍼(ring buffer)를 사용하지 않음)

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
		que[num++] = x;
		return x;
	}
	
	// 디큐
	public int dequeue() throws EmptyIntAryQueueException {
		if (num <= 0) // 큐가 비어있으면 num(현재 데이터 수)는 0이 된다. 이때, 부등호를 지정함으로써 큐 본체 배열의 하한을 벗어나는 것을 막을 수 있다. (프로그램의 안전성 향상)
			throw new EmptyIntAryQueueException();
		
		int x = que[0];
		
		for(int i = 0; i < num-1; i++) 
			que[i] = que[i+1];
		num--;
		return x;
	}
	
	// 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntAryQueueException {
		if (num <= 0) // 큐가 비어있으면 num은 0이 된다. 부등호를 사용하여 큐 본체 배열의 하한을 벗어나는 것을 방지한다.
			throw new EmptyIntAryQueueException();
		return que[num-1]; // 기존에 실수 했던 부분 => 프런트 : 데이터를 꺼내는 쪽 / 리어 : 데이터를 넣는 쪽
	}
	
	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			if(que[i] == x) // 검색 성공
				return i;
		} 
		return -1;			// 검색 실패
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
		for(int i = 0; i < num; i++) 			// 프런트는 데이터를 꺼내는 쪽이다.
			System.out.print(que[i] + " ");		// 큐는 선입선출(FIFO) 구조이므로 인덱스 0(프런트) 부터 조회하는 것이 맞다.
		System.out.println();
	}
}
