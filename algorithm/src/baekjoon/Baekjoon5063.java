package baekjoon;

import java.util.Scanner;

public class Baekjoon5063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int r = sc.nextInt();
			int e = sc.nextInt();
			int c = sc.nextInt();
			
			if(r == (e-c)) 
				System.out.println("does not matter");
			else if (r > (e-c))
				System.out.println("do not advertise");
			else
				System.out.println("advertise");
		}
	}
}