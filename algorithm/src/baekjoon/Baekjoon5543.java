package baekjoon;

import java.util.Scanner;

public class Baekjoon5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] hamburger = new int[3];
		int[] drink = new int[2];
		int set = 0;
		
		for(int i = 0; i < 3; i++) {
			hamburger[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 2; i++) {
			drink[i] = sc.nextInt();
		}
		
		set += min(hamburger);
		set += min(drink);
		set -= 50;
		
		System.out.println(set);
	}
	
	static int min(int[] price) {
		int min = price[0];
		
		for(int i = 1; i < price.length; i++) {
			if(min > price[i])
				min = price[i];
		}
		
		return min;
	}
}