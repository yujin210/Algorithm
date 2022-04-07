package baekjoon;

import java.util.Scanner;

public class Baekjoon2711 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int location = sc.nextInt();
			String str = sc.next();
			String result = "";
			for(int j = 0; j < str.length(); j++) {
				if(j != (location-1)) {
					result += str.charAt(j);
				}
			}
			System.out.println(result);
		}
	}
}