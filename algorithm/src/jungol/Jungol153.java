package jungol;

import java.util.Scanner;

public class Jungol153 {
	public static void main(String[] args) {
		int[] arr = new int[100]; // 100개의 정수를 입력받을 수 있는 배열
		int num = 0; // 입력 받은 값의 인덱스를 저장하기 위한 변수
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			num = i; // 인덱스 저장 (-1이 입력되어도 인덱스 증가함)
			if (arr[i] == -1) {
				break;
			}
		}
		
		if (num <= 2) { // -1을 제외하고 입력받은 정수가 3개 미만인 경우
			for(int i = 0; i <= num-1; i++) {
				System.out.printf("%d ", arr[i]); // -1 제외하고 입력받은 정수 모두 출력
			}
		} else {
			for(int j = (num-3); j <= (num-1); j++) { // -1을 제외한 마지막 세 개의 정수 출력
				System.out.printf("%d ", arr[j]);
			}
		}
	}
}
