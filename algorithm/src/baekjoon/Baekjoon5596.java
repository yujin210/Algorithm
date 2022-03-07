package baekjoon;

import java.util.Scanner;

public class Baekjoon5596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minguk = 0;
		int manse = 0;
		
		for(int i = 0; i < 4; i++) {
			minguk += sc.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			manse += sc.nextInt();
		}
		
		System.out.println(minguk >= manse ? minguk : manse);
	}
}
