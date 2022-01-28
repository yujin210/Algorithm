package doit.chap04;
// int형 큐

public class IntQueue {
	private int max;	// 큐의 용량
	private int front;	// 첫 번째 요소 커서 : 인큐하는 첫 번째 데이터의 인덱스 저장
	private int rear;	// 마지막 요소 커서 	: (제일 마지막에 인큐하는 데이터의 인덱스 + 1) 번째 인덱스를 저장 (다음 인큐시에 데이터가 저장될 인덱스를 미리 준비)
	private int num;	// 현재 데이터 수   : front와 rear의 값이 같을 때, 큐가 비어있는지, 가득 찼는지 구분하기 위한 변수
	private int[] que;	//  큐 본체
	
	// 실행 시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	// 실행 시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	// 생성자
	public IntQueue(int capacity) {
		num = front = rear = 0;			// 처음에는 큐가 비어있으므로 num, front, rear 값을 모두 0으로 설정
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;					// 배열 본체 생성 실패 시, 다른 메서드가 존재하지 않는 배열에 접근하는 것을 막기 위해 max를 0으로 설정
		}
	}
	
	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max) 
			throw new OverflowIntQueueException();	// 큐가 가득 참
		que[rear++] = x;							// 데이터 인큐 후, rear 값 1 증가
		num++;										// 데이터 인큐 후, num 값 1 증가
		if (rear == max)							// rear와 max의 값이 동일할 경우
			rear = 0;								// rear의 값을 0으로 변경하여 rear가 max의 범위를 벗어나는 것을 방지한다.
		return x;									// 인큐 성공 시 인큐한 값을 그대로 반환
	}
	
	// 큐에 데이터를 디큐
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();		// 큐가 비어 있음
		int x = que[front++];						// 저장한 데이터를 꺼낸 후, front의 값 1 증가
		num--;										// 저장한 데이터를 꺼낸 후, num 값 1 감소
		if (front == max)							// front와 max의 값이 동일할 경우
			front = 0;								// front의 값을 0으로 변경하여 front가 max의 범위를 벗어나는 것을 방지한다.
		return x;									// 디큐 성공 시 디큐한 값을 반환
	}
	
	// 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();	// 큐가 비어 있음
		return que[front];						// 단순히 프런트 데이터를 확인만 하는 것이기 때문에 front의 값은 변하지 않는다.
	}
	
	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) { 	
			int idx = (i + front) % max;	// 링버퍼 큐의 경우 front 값이 변하므로 이와 같은 식을 사용한다.
			// front 위치 고정 + i 값 변화 => 인덱스 증가시키면서 검색. 이때 더하기만 하면 max의 범위를 넘어가므로 max로 나눈 나머지를 취해 (front+i)==max가 되는 순간 다시 0부터 시작하도록 한다.
			if (que[idx] == x)				// 검색 성공
				return x;
		}
		return -1;							// 검색 실패
	}
	
	// 큐를 비움
	public void clear() {
		front = rear = num = 0;
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
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for(int i = 0; i < num; i++)
				System.out.print(que[(front+i) % max] + " ");
			System.out.println();		
		}
	}
	
}
