package doit.chap02;
import java.util.Scanner;
// 배열 요소에 값을 읽어 들여 역순으로 정렬합니다.

public class ReverseArray {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {	  // 이때 매개변수는 3개가 필요하다. 
		// (1. 배열 본체를 참조하는 배열 변수(정렬할 배열의 요소가 어떤 것인지 알기 위함), 2. 값을 교환할 인덱스1, 3. 값을 교환할 인덱스2
		// 배열 변수는 타입이 int[], 인덱스는 그냥 정수 int형 타입으로 사용하면 된다.

		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {	  // 배열을 역순으로 정렬하는 메서드
		// 역순 정렬은 배열 양쪽의 값을 서로 바꿔주면 된다.(크기가 5일 경우, 0번 인덱스 - 4번 인덱스, 1번 인덱스 - 3번 인덱스 => 교환 후 인덱스 순서 : 4 3 2 1 0 )  
		for(int i = 0; i < (a.length/2); i++) { // 배열의 크기가 홀수일 경우 가운데 값은 바꿔주지 않아도 되므로 "크기/2"를 사용해 몫만 취한다. 
			swap(a, i, a.length-i-1);			// 값을 바꿀 인덱스를 구하는 식은 a.length-i-1이다. 인덱스는 0부터 시작하므로 1을 빼주는 것이다.
			
			//swap(a, a[i], a[a.length-i-1]);	// 이렇게 적으면 안된다. 
			//처음에 코드를 작성할 때 했던 실수인데, 이렇게 되면 swap의 매개변수에 '인덱스 값'이 아니라 '해당 인덱스에 저장된 값'이 매개변수로 넘어가서 인덱스의 범위를 벗어나는 오류가 발생한다.
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();	// 요솟수
		
		int[] x = new int[num]; 	// 요솟수가 num인 배열
				
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);		// 배열 a의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
