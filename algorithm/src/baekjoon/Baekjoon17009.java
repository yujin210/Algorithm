package baekjoon;

import java.util.Scanner;

public class Baekjoon17009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalA = 0;
		int totalB = 0;
		int[] scoreA = new int[3];
		int[] scoreB = new int[3];
		
		for(int i = 0; i < 3; i++) {
			scoreA[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			scoreB[i] = sc.nextInt();
		}
		
		totalA += scoreA[0] * 3;
		totalB += scoreB[0] * 3;
		
		totalA += scoreA[1] * 2;
		totalB += scoreB[1] * 2;
		
		totalA += scoreA[2] * 1;
		totalB += scoreB[2] * 1;
		
		System.out.println(totalA == totalB ? 'T' : totalA > totalB ? 'A' : 'B');
	}
}