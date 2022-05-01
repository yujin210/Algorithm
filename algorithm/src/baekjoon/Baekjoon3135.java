package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class Baekjoon3135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int now = sc.nextInt();		// 현재 주파수
		int want = sc.nextInt();	// 듣고 싶은 주파수
		int n = sc.nextInt();		// 저장된 주파수 목록의 개수
		int[] abs = new int[n+1];   // (현재 주파수, 저장된 주파수)와 (듣고싶은 주파수)의 차이 
		int check = 0;
		
		abs[0] = Math.abs(want-now);
		check = abs[0];
		
		for(int i = 1; i <= n; i++) {
			abs[i] = Math.abs(want-sc.nextInt());
		}
		
		Arrays.sort(abs);
		
		if(abs[0] == check) 
			System.out.println(abs[0]);
		else
			System.out.println(abs[0]+1);
	}
}