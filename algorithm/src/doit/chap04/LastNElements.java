package doit.chap04;
import java.util.Scanner;
// 원하는 개수만큼 값을 입력 받아 요솟수가 N인 배열에 마지막 N개를 저장 => 링버퍼는 오래된 데이터를 버리는 용도로 활용할 수 있다.
// ex) 장바구니 : 최근에 담은 10개의 상품만 나타납니다.

public class LastNElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N];	// 입력 받은 값을 저장
		int cnt = 0;			// 입력 받은 개수
		int retry;				// 다시 한 번?
		
		System.out.println("정수를 입력하세요.");
		
		do {
			System.out.printf("%d번째 정수 : ", cnt+1);	// 인덱스가 아닌 순서를 표현하므로 cnt+1로 표현 (cnt 값은 변하지 않음)
			a[cnt++ % N] = sc.nextInt();				// N으로 나눈 나머지이므로 인덱스 0부터 9까지 표현할 수 있다. 
			// cnt == 10인 경우, 10을 10으로 나눈 나머지는 0이므로 인덱스 0번에 새로운 내용이 덮어 씌워지게 된다.
			
			System.out.print("계속 할까요? (예.1/아니오.0) : ");
			retry = sc.nextInt();
		} while (retry == 1); // 예.1 번을 선택한 경우 반복한다.
		
		// 반복이 끝난 후
		
		int i = cnt - N;	// 결과를 반복할 횟수를 정하기 위함이다.
		
		if(i<0)	
			i = 0;			// 순서를 표현할 때 마이너스 값이 나오지 않도록 i가 0보다 작은 경우 i를 0으로 만들어준다.
		
		for(; i < cnt; i++) // 초기값을 설정하지 않아서 특정 횟수만큼 반복이 아닌 조건을 충족하는 만큼만 반복시킨다.
			System.out.printf("%2d번째의 정수 = %d\n", i+1, a[i%N]); // 순서는 1부터 시작하므로 i+1로 표현했고, 인덱스는 N으로 나눠서 N의 범위 내에서 나타낼 수 있도록 한다.
	}
}
