package jungol;

import java.util.Arrays;
import java.util.Scanner;

public class Jungol159 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] arr = new int[num]; // 입력받은 정수 크기의 배열 생성
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = num-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
