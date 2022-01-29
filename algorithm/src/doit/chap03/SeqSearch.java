package doit.chap03;
import java.util.Scanner;
// 선형 검색

public class SeqSearch {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		// 책에서 설명하는 배열 검색의 종료 조건은 두 가지이다.
		// 1. 검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우
		// 2. 검색할 값과 같은 요소를 발견한 경우
		
		// 구현 방법 1 : while 사용
		while(true) {
			if(i == n)		// 1번에 해당 (i는 0부터 시작이고, n은 인덱스의 값이 아닌 배열 크기의 값이기 때문에 (i == n)이 성립하는 경우는 찾는 값이 배열에 존재하지 않아 n+1번 반복했을 때이다.) 
				return -1;	// 검색 실패 (-1을 반환)
			
			if(a[i] == key)	// 2번에 해당 
				return i;	// 검색 성공 (인덱스를 반환)
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num]; // 요솟수가 num개인 배열 x 생성
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = seqSearch(x, num, key);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else 
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		
	}
}
