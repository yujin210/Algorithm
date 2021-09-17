/*
2021.09.17 금요일
[정보올림피아드 알고리즘] 558 : 배열1 - 자가진단4
http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=195&sca=1090
---
문제 )
100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.

입력 예 )
3 5 10 55 0

출력 예 )
55 10 5 3
*/
package array;

import java.util.Scanner;

public class Jungol558 {
	public static void main(String[] args) {
		int[] arr = new int[100]; // 100개의 정수 저장할 수 있는 배열 선언
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			cnt++;  
			
			if(arr[i] == 0) { 
				break; // 입력된 값이 0이면 배열 값 삽입 중단
			}
		}
		
		for(int i = cnt-2; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
	}
}
