package doit.chap03;
import java.util.Scanner;
// 선형 검색 (보초법)

public class SeqSearchSen {

	// 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
	// 보초법 : 검색하기 전에 찾고자 하는 키 값을 맨 끝 요소에 저장하여, 원하는 값이 원래의 데이터에 존재하지 않아도 보초까지 검색하면 검색을 종료하는 것이다. -> 종료 판단 횟수를 줄일 수 있는 장점이 있다.
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;	// 보초를 추가
		
		while(true) {
			if (a[i] == key)	// 검색 성공
				break;
			i++;
		}
		return i == n ? -1 : i;	// i값이 n이면 찾은 값이 보초이므로 검색 실패임을 나타내는 -1 반환 (i를 후치증가 연산자를 사용하였기 때문에 n의 크기와 비교가 가능하다.)
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num+1];		// 요솟수 num + 1
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");	// 키 값을 입력
		int key = sc.nextInt();
		
		int idx = seqSearchSen(x, num, key);	// 배열 x에서 값이 key인 요소를 검색
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else 
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
	}
}
