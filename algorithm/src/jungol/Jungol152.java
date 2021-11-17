package jungol;

import java.util.Scanner;

public class Jungol152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(i == 0 || i % 2 == 0) { // 홀수 번째 입력 (인덱스는 0부터 시작하므로 인덱스가 0 혹은 짝수일 때가 홀수 번째 입력이다.)
				odd += arr[i];
			} else { // 짝수 번째 입력
				even += arr[i]; 
			}
		}
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
