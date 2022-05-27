package baekjoon;

import java.util.Scanner;

public class Baekjoon10101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] angle = new int[3];
		boolean check = true; // 60도 판단
		boolean same = true;
		for(int i = 0; i < 3; i++) {
			angle[i] = sc.nextInt();
		}
		
		int sum = angle[0];
		int set1 = angle[0];
		int set2 = angle[1];
		int set3 = angle[2];
		
		if(angle[0] != 60)
			check = false;
		
		for(int i = 1; i < 3; i++) {
			if(angle[i] != 60) {
				check = false;
			}
						
			sum += angle[i];	
		}
		
		if(set1 != set2 && set2 != set3 && set1 != set3) {
			same = false;			
		}
		
		if(check == true && sum == 180)
			System.out.println("Equilateral");
		else if (same == true && sum == 180)
			System.out.println("Isosceles");
		else if (same == false && sum == 180)
			System.out.println("Scalene");
		else
			System.out.println("Error");
	}
}