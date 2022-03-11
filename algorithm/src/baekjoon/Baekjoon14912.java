package baekjoon;

import java.util.Scanner;

public class Baekjoon14912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int digit = sc.nextInt();
		int count = 0;
		int temp = 0;
		int mod = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i <= 9) {
				if(i == digit)
					count++;
			} else {
				temp = i;
				while(temp != 0) {
					mod = (temp%10);
					if(mod == digit)
						count++;
					
					temp /= 10;
				}
			}
		}
		
		System.out.println(count);
	}
}
