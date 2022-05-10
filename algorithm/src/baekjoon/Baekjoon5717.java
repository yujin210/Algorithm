package baekjoon;

import java.util.Scanner;

public class Baekjoon5717 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int male = sc.nextInt();
		int female = sc.nextInt();
		
		while(male != 0 && female != 0) {
			System.out.println(male+female);
			
			male = sc.nextInt();
			female = sc.nextInt();
		}
	}
}