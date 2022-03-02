package baekjoon;

import java.util.*;

public class Baekjoon1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arrN = new int[n];
		
		for(int i = 0; i < n; i++) {
			arrN[i] = sc.nextInt();
		}
		
		Arrays.sort(arrN);
		
		int m = sc.nextInt();
		int[] arrM = new int[m];
		
		for(int i = 0; i < m; i++) {
			arrM[i] = sc.nextInt();
		}
		
		int[] answer = new int[m];
		int idx = 0;
		
		for(int i = 0; i < m; i++) {
			idx = binSearch(arrN, n, arrM[i]);
			if(idx < 0)
				answer[i] = 0;
			else 
				answer[i] = 1;
		}
		
		for(int i : answer) {
			System.out.println(i);
		}
	}
	
	static int binSearch(int[] arr, int size, int key) {
		int pl = 0;
		int pr = size - 1;
		
		do {
			int pc = (pl + pr) / 2;
			if(arr[pc] == key) { // 검색 성공 
				return pc;
			} else if (arr[pc] > key) { // 찾는 값보다 중앙 값이 더 클 때 
				pr = pc-1; // 검색 범위를 앞쪽 절반으로 줄임 
			} else { // 찾는 값이 중앙 값보다 더 클 때 
				pl = pc+1; // 검색 범위를 뒤쪽 절반으로 줄임 
			}
		} while (pl <= pr);

		return -1; // 검색 실패 
	}
}
