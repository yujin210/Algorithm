package baekjoon;

import java.util.Scanner;

public class Baekjoon2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int money = sc.nextInt();
			change(money);
		}
	}
	
	static void change(int money) {		
		int[] coin = {25, 10, 5, 1};
		
		int[] change = new int[4];
		
		for(int i = 0; i < coin.length; i++) {
			while(money >= coin[i]) {
				money -= coin[i];
				change[i]++;
			}
		}
		
		for(int i = 0; i < change.length; i++) {
			if(i == change.length-1) {
				System.out.println(change[i]);
			} else {
				System.out.print(change[i] + " ");
			}
		}		
	}
}