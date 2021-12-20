package jungol;

import java.util.Scanner;

public class Jungol111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int korean = sc.nextInt();
		int english = sc.nextInt();
		int math = sc.nextInt();
		int computer = sc.nextInt();
		
		int sum = korean + english + math + computer;
		
		int avg = sum / 4;
		
		System.out.printf("sum %d\n", sum);
		System.out.printf("avg %d", avg);
	}
}
