package jungol;

import java.util.Scanner;

public class Jungol1692 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int[] nums = new int[4];
		
		for(int i = 0; i < 3; i++) {
			nums[i] = num1*(num2%10);
			num2 /= 10;
		}
		
		nums[3] = nums[0] + nums[1]*10 + nums[2]*100;
		
		for(int i : nums) {
			System.out.println(i);
		}
	}
}
