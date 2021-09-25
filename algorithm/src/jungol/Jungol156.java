package jungol;

import java.util.Scanner;

public class Jungol156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100]; // 입력받는 정수가 100개 이하이므로 배열 크기 100으로 지정
	
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) { // 배열에 숫자 입력
			arr[i] = sc.nextInt(); // 숫자 차례로 입력 받기
			cnt++;
			if(arr[i] == 999) { // 999 입력 시 반복 종료
				break;
			} 
		} // end for
		
		int min = 998;
		int max = -999;
		for(int i = 0; i < cnt-1; i++) { // cnt는 999를 포함하므로 -1 하여 999 제외
			if (arr[i] <= min) {
				min = arr[i];
			}
			
			if (max <= arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
