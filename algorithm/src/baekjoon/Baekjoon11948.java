package baekjoon;

import java.util.*;

public class Baekjoon11948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] science = new int[4];
		int[] social = new int[2];
		int total = 0;
		
		for(int i = 0; i < 4; i++) {
			science[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 2; i++) {
			social[i] = sc.nextInt();
		}
		
		Arrays.sort(science);
		Arrays.sort(social);
		
		for(int i = 3; i >= 1; i--) {
			total += science[i];
		}
		
		total += social[1];
		
		System.out.println(total);
	}
}
