package jungol;

import java.util.Scanner;

public class Jungol157 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int cnt = 0;
		
		while(true) {
			arr[cnt] = sc.nextInt();
			if(arr[cnt] == 0) { // 0이 입력되면 반복 중단
				break;
			}
			cnt++;
		}
		int mul5 = 0;
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < cnt; i++) {
			if(arr[i] % 5 == 0) {
				mul5++;
				sum += arr[i]; 
			}
		}
		
		avg = (double) sum / (double) mul5;
		
		System.out.println("Multiples of 5 : " + mul5);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + Math.round(avg*10)/10.0);
	}
}
