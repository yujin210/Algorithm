package doit.chap01;

import java.util.Scanner;

public class Q7Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i != n) {
				System.out.print(i + " + ");
				sum += i;				
			} else {
				System.out.print(i + " = ");
				sum += i;
			}
		}
		
		System.out.print(sum);
	}
}
