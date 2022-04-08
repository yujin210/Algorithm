package baekjoon;

import java.util.Scanner;

public class Baekjoon13163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String[] nicknames = new String[n];
		
		for(int i = 0; i < n; i++) {
			nicknames[i] = "";
		}
		

		for(int i = 0; i < n; i++) {
			String[] temp = sc.nextLine().split(" ");

			temp[0] = "god";
			
			for(int j = 0; j < temp.length; j++) {
				nicknames[i] += temp[j];
			}
		}
		
		for(String s : nicknames) {
			System.out.println(s);
		}
	}
}