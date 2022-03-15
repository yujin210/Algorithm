package baekjoon;

import java.util.Scanner;

public class Baekjoon1550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hexa = sc.next();
		int digits = 0;
		int result = 0;
		
		for(int i = hexa.length()-1; i >= 0; i--) {
			result += change(hexa.charAt(i))*(long) Math.pow(16, digits++);
		}
		
		System.out.println(result);
		
		
	}
	
	static int change(char ch) {
		int result = 0;
		
		switch(ch) {
		case '1' : 
			result = 1;
			break;
		case '2' : 
			result = 2;
			break;
			
		case '3' : 
			result = 3;
			break;
			
		case '4' : 
			result = 4;
			break;
			
		case '5' :
			result = 5;
			break;
			
		case '6' : 
			result = 6;
			break;
			
		case '7' : 
			result = 7;
			break;
			
		case '8' :
			result = 8;
			break;
			
		case '9' :
			result = 9;
			break;
			
		case 'A' :
			result = 10;
			break;
			
		case 'B' :
			result = 11;
			break;
			
		case 'C' :
			result = 12;
			break;
			
		case 'D' :
			result = 13;
			break;
			
		case 'E' :
			result = 14;
			break;
			
		case 'F' :
			result = 15;
			break;
		}
		
		return result;
	}
}
