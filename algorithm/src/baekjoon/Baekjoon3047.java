package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon3047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		
		String str = sc.next();
		Arrays.sort(arr);
		
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		
		for(int i = 0; i < 3; i++) {
			char ch = str.charAt(i);
			
			if(ch == 'A')
				System.out.print(a);
			else if (ch == 'B')
				System.out.print(b);
			else
				System.out.print(c);
			
			System.out.print(" ");
		}
	}
}