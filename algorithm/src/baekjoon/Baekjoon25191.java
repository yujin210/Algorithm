package baekjoon;

import java.util.Scanner;

public class Baekjoon25191 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int chicken = sc.nextInt();
		int coke = sc.nextInt();
		int beer = sc.nextInt();
		int count = 0;
		
		while((beer >= 1 || coke >= 2) && chicken >= 1) {
			if(beer >= 1) 
				beer -= 1;
			else if (coke >= 2) 
				coke -= 2;			
			
			chicken -= 1;
			count++;
		}
		
		System.out.println(count);
	}
}