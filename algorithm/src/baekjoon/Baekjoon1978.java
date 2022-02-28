package baekjoon;

import java.util.Scanner;

public class Baekjoon1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(find(arr[i]))
				answer++;
		}
		
		System.out.println(answer);
	}
	
	static boolean find(int n) {
		boolean result = true;
		
		if(n == 1) {
			result = false;
			return result;
		}
		
		if(n == 2) {
			return result;
		} 
		
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				result = false;
				break;
			}
		}

		return result;
	}
}
