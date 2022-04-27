package baekjoon;

import java.util.Scanner;

public class Baekjoon3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		int[] now = new int[6];
		int[] answer = new int[6];
		
		for(int i = 0; i < chess.length; i++) {
			now[i] = sc.nextInt();
		}
		
		for(int i = 0; i < chess.length; i++) {
			if(now[i] > chess[i])
				answer[i] = -(now[i]-chess[i]);
			else if(now[i] < chess[i])
				answer[i] = chess[i]-now[i];
		}
		
		for(int i : answer) {
			System.out.print(i + " ");
		}
	}
}