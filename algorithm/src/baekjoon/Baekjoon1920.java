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
			idx = Arrays.binarySearch(arrN, arrM[i]);
			if(idx < 0)
				answer[i] = 0;
			else 
				answer[i] = 1;
		}
		
		for(int i : answer) {
			System.out.println(i);
		}
	}
}
