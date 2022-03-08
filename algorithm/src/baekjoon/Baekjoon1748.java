package baekjoon;

import java.util.Scanner;

public class Baekjoon1748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 0;
		int digits = 0;
		
		for(int i = 1; i <= num; i++) {
			int temp = i;
			while(temp != 0) {
				digits++;
				temp /= 10;
			}
			
			result += digits;
			
			digits = 0;
		}
		
		System.out.println(result);
	}
}
