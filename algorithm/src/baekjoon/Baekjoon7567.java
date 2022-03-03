package baekjoon;

import java.util.Scanner;

public class Baekjoon7567 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String bowl = sc.next();
		int height = 10; // 처음 놓여진 그릇의 높이
		char pre = bowl.charAt(0);
		char now;
		
		for(int i = 1; i < bowl.length(); i++) {
			now = bowl.charAt(i);
			
			if(now == pre)
				height += 5;
			else 
				height += 10;
			
			pre = now;
		}
		
		System.out.println(height);
	}
}