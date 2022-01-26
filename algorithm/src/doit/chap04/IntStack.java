package doit.chap04;
// int형 스택

public class IntStack {
	private int max;	// 스택 용량
	private int ptr;	// 스택 포인터
	private int[] stk;	// 스택 본체
	
	// 실행 시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	// 생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];			// 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) {	// 생성할 수 없음
			max = 0;
		}
	}
	
	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max)			// 스택이 가득 참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;  // 데이터 푸시 후 ptr(스택 포인터) 값 1 증가
	}
	
	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)			// 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[--ptr];		// ptr(스택 포인터) 값을 먼저 1 감소 시킨 후 저장되어 있는 값 반환 
	}
	
	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)			// 스택이 비어있음
			throw new EmptyIntStackException();
		return stk[ptr - 1];	// 포인터의 값은 변화시키지 않고 정상에 있는 데이터 값 반환 
	}
	
	// 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(int x) {
		for(int i = ptr-1; i >= 0; i--)	// 정상(Top) 쪽에서 선형 검색 => 꼭대기(Top) 부터 스캔하는 이유는 먼저 pop 되는 데이터를 찾기 위함
			if (stk[i] == x)
				return i;	// 검색 성공
		return -1;			// 검색 실패
	}
	
	// 스택을 비움
	public void clear() {
		ptr = 0; // 스택에서 push, pop 등 모든 작업은 스택 포인터를 바탕으로 이뤄지기 때문에 모든 요소의 삭제는 ptr 값을 0으로 해주면 됨
	}
	
	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 스텍에 쌓여 있는 데이터 수를 반환
	public int size() {
		return ptr;
	}
	
	// 스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0) 
			System.out.println("스택이 비어 있습니다.");
		else {
			for(int i = 0; i < ptr; i++) 
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
