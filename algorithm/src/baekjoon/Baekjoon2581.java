package baekjoon;

import java.util.Scanner;
import java.util.ArrayList;

public class Baekjoon2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Integer> arrlist = new ArrayList<>();
		
		for(int i = m; i <= n; i++) {
			if(find(i)) 
				arrlist.add(i);
		}
		
		if(arrlist.size() == 0) {
			System.out.println(-1);
		} else {
			int min = arrlist.get(0);
			int sum = 0;
			for(int i : arrlist) {
				sum += i;
			}
		
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
	
	static boolean find(int num) {
		boolean result = true;
		
		if(num == 1) {
			result = false;
			return result;
		}
		
		if(num == 2) {
			return result;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num%i == 0) {
				result = false;
				return result;
			}
		}
		
		return result;
	}
}
