package jungol;

import java.util.Scanner;

public class Jungol160 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		
		for(int i = 1; i <= 10; i++) {
			int num = sc.nextInt();
			
			switch(num) {
				case 1 :
					arr[num-1] += 1;
					break;
				case 2 :
					arr[num-1] += 1;
					break;
				case 3 :
					arr[num-1] += 1;
					break;
				case 4 : 
					arr[num-1] += 1;
					break;
				case 5 :
					arr[num-1] += 1;
					break;
				case 6 : 
					arr[num-1] += 1;
					break;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + " : " + arr[i]);
		}
	}
}
