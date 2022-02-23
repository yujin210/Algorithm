package jungol;

import java.util.Scanner;

public class Jungol1430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[10]; 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mul = a*b*c;
		
		while(mul != 0) {
			nums[mul%10]++;
			mul/=10;
		}
		
		for(int i : nums) {
			System.out.println(i);
		}
	}
}
