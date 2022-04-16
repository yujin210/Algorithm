package baekjoon;

import java.util.Scanner;

public class Baekjoon23825 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int countS = sc.nextInt();
		int countA = sc.nextInt();
		
		countS /= 2;
		countA /= 2;
		
		if(countS >= countA)
			System.out.println(countA);
		else
			System.out.println(countS);
	}
}