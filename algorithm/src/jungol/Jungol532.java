// 21.09.18 Åä¿äÀÏ
package jungol;

import java.util.Scanner;

public class Jungol532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		
		if (num1 >= 4.0 && num2 >= 4.0) {
			System.out.println("A");
		} else if (num1 >= 3.0 && num2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}
