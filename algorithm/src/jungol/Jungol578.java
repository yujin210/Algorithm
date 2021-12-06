package jungol;

import java.util.Scanner;

public class Jungol578 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		mul(num1, num2);
	}

	static void mul(int num1, int num2) {
		int max = 0;
		int min = 0;

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		for (int i = min; i <= max; i++) {
			System.out.println("== " + i + "dan ==");
			for (int j = 1; j <= 9; j++) {
				//System.out.println(i + " * " + j + " = " + i * j);
				System.out.printf("%d * %d = %2d%n", i, j, i*j); //글자를 오른쪽으로 정렬해서 출력하기 위함
			}
			System.out.println();
		}
	}
}
