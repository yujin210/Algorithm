/*
2021.09.16 목요일
[정보올림피아드 알고리즘] 562 : 배열1 - 자가진단8
http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=199&sca=1090 
---
문제 )
10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
평균은 반올림하여 소수첫째자리까지 출력한다.

입력 예 )
95 100 88 65 76 89 58 93 77 99

출력 예 )
sum : 446
avg : 78.8
*/
// 문제 풀이 시 주의점 : 배열의 인덱스 번호와 입력된 순서는 다른 것이다. (배열의 인덱스는 0부터 시작이지만, 0번 인덱스는 1번째로 입력 된 값이다.)
package array;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0; // 짝수 번째 입력 합 담을 변수
		double avg = 0; // 홀수 번째 입력 합 담을 변수 

		for(int i=0; i<arr.length; i++) {
			if (i % 2 == 1) {
				sum += arr[i];
			} else {
				avg += arr[i];
			}
		}
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (avg/5));
	}
}