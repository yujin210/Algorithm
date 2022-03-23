package baekjoon;

import java.util.Scanner;

public class Baekjoon2902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String longName = sc.next();
		longName = longName.toUpperCase();
		String[] names = longName.split("-");
		
		String shortName = "";
		
		for(int i = 0; i < names.length; i++) {
			shortName += names[i].charAt(0);
		}
		
		System.out.println(shortName);
	}
}
