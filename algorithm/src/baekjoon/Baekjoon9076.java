package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon9076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			ArrayList<Integer> score = new ArrayList<>();
			
			for(int j = 0; j < 5; j++) {
				score.add(sc.nextInt());
			}
			
			Collections.sort(score);
			
			score.remove(4);
			score.remove(0);
			
			if(score.get(2)-score.get(0) >= 4)
				System.out.println("KIN");
			else {
				int sum = 0;
				for(int n : score) {
					sum += n;
				}
				
				System.out.println(sum);
			}
		}
	}
}