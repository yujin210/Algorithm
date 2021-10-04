package jungol;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Jungol188 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str);
		
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			cnt++;
			System.out.println(cnt + ". " + st.nextToken());
		}
	}
}
