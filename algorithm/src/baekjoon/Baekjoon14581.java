package baekjoon;

import java.util.Scanner;

public class Baekjoon14581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = sc.next();
		
		String[][] fans = new String[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1 && j == 1) 
					fans[i][j] = ":"+id+":";
				else
					fans[i][j] = ":fan:";
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(fans[i][j]);
			}
			System.out.println();
		}
	}
}