package jungol;

import java.util.Scanner;

public class Jungol158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int[] arr = new int[100];
		
		while(true) {
			int num = sc.nextInt();
			if(num == 0) {
				break;
			} else {
				arr[cnt] = num;
				cnt++;
			}
		}
		
		int[] arrCnt = new int[cnt];
		
		for(int i = 0; i < arrCnt.length; i++) {
			arrCnt[i] = arr[i];
			if(arrCnt[i] % 2 == 0) {
				arrCnt[i] = arrCnt[i]/2;
			} else {
				arrCnt[i] = arrCnt[i]*2;
			}
		}
		
		System.out.println(cnt);
		
		for(int i = 0; i < arrCnt.length; i++) {
			System.out.printf("%d ", arrCnt[i]);
		}
	}
}
