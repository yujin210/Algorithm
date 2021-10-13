package jungol;

import java.util.Scanner;

public class Jungol632 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int min = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 <= num2) { // num1이 num2보다 작고
			if(num1 <= min) { // num1이 min보다 작으면 최소값은 num1
				min = num1;
			} 
		} else {
			if(num2 <= min) {
				min = num2;
			}
		}
		System.out.println(min);
	}
}
