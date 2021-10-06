package jungol;

import java.util.Scanner;

public class Jungol559 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] arr = new double[]{85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		int class1 = sc.nextInt();
		int class2 = sc.nextInt();
		
		System.out.println(arr[class1-1] + arr[class2-1]);
	}
}

