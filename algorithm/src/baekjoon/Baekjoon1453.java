package baekjoon;

import java.util.Scanner;

public class Baekjoon1453 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] seat = new int[100]; // 0 : 자리가 비어있음, 1 : 자리에 사람이 있음 
		int ban = 0;
		
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			
			if(seat[temp-1] == 0) 
				seat[temp-1] = 1; // 자리가 비어있다면 앉을 수 있음
			else
				ban++;
		}
		
		System.out.println(ban);
	}
}
