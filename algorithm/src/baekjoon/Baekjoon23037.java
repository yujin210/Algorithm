package baekjoon;

import java.util.Scanner;

public class Baekjoon23037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int total = 0;
		
		while(n != 0) {
			int temp = n%10;
			total += Math.pow(temp, 5);
			n /= 10;
		}
		
		System.out.println(total);
	}
}