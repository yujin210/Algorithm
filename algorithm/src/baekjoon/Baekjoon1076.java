package baekjoon;

import java.util.Scanner;

public class Baekjoon1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String color1 = sc.next();
		String color2 = sc.next();
		String color3 = sc.next();
		
		long result = ((value(color1)*10)+value(color2));
		result *= mul(color3);
		
		System.out.println(result);
	}

	static int value(String color) {
		int result = 0;
		switch(color) {
		case "black" : 
			result = 0;
			break;
		case "brown" : 
			result = 1;
			break;
		case "red"	 : 
			result = 2;
			break;
		case "orange" : 
			result = 3;
			break;
		case "yellow" :
			result = 4;
			break;
		case "green" : 
			result = 5;
			break;
		case "blue"  : 
			result = 6;
			break;
		case "violet" :
			result = 7;
			break;
		case "grey" :
			result = 8;
			break;
		case "white" :
			result = 9;
			break;
		default :
			result = -1;
		}
		
		return result;
	}
	
	static int mul(String color) {
		int result = 1;
		switch(color) {
		case "black" : 
			result = 1;
			break;
		case "brown" : 
			result = 10;
			break;
		case "red"	 : 
			result = 100;
			break;
		case "orange" : 
			result = 1000;
			break;
		case "yellow" :
			result = 10000;
			break;
		case "green" : 
			result = 100000;
			break;
		case "blue"  : 
			result = 1000000;
			break;
		case "violet" :
			result = 10000000;
			break;
		case "grey" :
			result = 100000000;
			break;
		case "white" :
			result = 1000000000;
			break;
		default :
			result = -1;
		}
		
		return result;
	}
}
