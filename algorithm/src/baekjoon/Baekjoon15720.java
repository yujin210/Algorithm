package baekjoon;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Baekjoon15720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int burger = sc.nextInt();
		int side = sc.nextInt();
		int drink = sc.nextInt();
		
		int before = 0;
		int discount = 0;
		int min = min(burger, side, drink);
		int set = 0;
		
		Integer[] burgers = new Integer[burger];
		Integer[] sides = new Integer[side];
		Integer[] drinks = new Integer[drink];
		
		for(int i = 0; i < burger; i++) {
			burgers[i] = sc.nextInt();
			before += burgers[i];
		}
		
		for(int i = 0; i < side; i++) {
			sides[i] = sc.nextInt();
			before += sides[i];
		}
		
		for(int i = 0; i < drink; i++) {
			drinks[i] = sc.nextInt();
			before += drinks[i];
		}
		
		Arrays.sort(burgers, Collections.reverseOrder());
		Arrays.sort(sides, Collections.reverseOrder());
		Arrays.sort(drinks, Collections.reverseOrder());
		
		for(int i = 0; i < min; i++) {
			set += burgers[i] + sides[i] + drinks[i];
		}
		
		discount = before - set;
		discount += set*0.9;
		
		System.out.println(before);
		System.out.println(discount);
	}
	
	static int min(int b, int s, int d) {
		int min = b;
		
		if(min > s)
			min = s;
		
		if(min > d)
			min = d;
		
		return min;
	}
}