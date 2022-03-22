package baekjoon;

import java.util.Scanner;

public class Baekjoon2754 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String grade = sc.next();
		float score = 0;
		
		switch(grade) {
		case "A+" : score = 4.3F; break; 
		case "A0" : score = 4.0F; break; 
		case "A-" : score = 3.7F; break; 
		case "B+" : score = 3.3F; break; 
		case "B0" : score = 3.0F; break; 
		case "B-" : score = 2.7F; break; 
		case "C+" : score = 2.3F; break; 
		case "C0" : score = 2.0F; break; 
		case "C-" : score = 1.7F; break; 
		case "D+" : score = 1.3F; break; 
		case "D0" : score = 1.0F; break; 
		case "D-" : score = 0.7F; break; 
		case "F" : score = 0.0F; break; 
		}
		
		System.out.printf("%02.1f", score);
	}
}
