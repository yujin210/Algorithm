package baekjoon;

import java.util.*;

public class Baekjoon6359 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] room = new int[n];  
			
			openOrClose(room);
		}
	}
	
	static void openOrClose(int[] arr) {
		// 0 : 열기, 1 : 잠그기 (배열이 0으로 초기화 될때 첫 번째 라운드가 시작되어 방이 모두 열린 것으로 설정)
		int idx; 	
		int count = 0;
		for(int i = 2; i <= arr.length+1; i++) { // 게임을 반복할 횟수
			for(int j = 0; j < arr.length; j++) { // 각 방의 상태
				idx = ((j+1)*i)-1;
				if(idx >= arr.length) {
					break;
				} else {
					if(i == 2 && idx < arr.length) {
						arr[idx] = 1; // 2번째 라운드에서는 2의 배수번째 방의 문을 잠근다.
					} else {
						if(arr[idx] == 0 && idx < arr.length) {
							arr[idx] = 1;
						} else if (arr[idx] == 1 && idx < arr.length) {
							arr[idx] = 0;
						}
					}
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0)
				count++;
		}
		
		System.out.println(count);
	}
}
