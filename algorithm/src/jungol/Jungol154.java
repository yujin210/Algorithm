package jungol;

import java.util.Scanner;

public class Jungol154 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[6];
		double sum = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		
		avg = Math.round((sum/6)*10)/10.0;
		System.out.println(avg);
	}
}
