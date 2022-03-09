package baekjoon;

import java.util.*;

public class Baekjoon10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int size = str.length()-1;
		boolean result = true;
		
		for(int i = 0; i <= str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(size--)) {				
				result = false;
				break;
			}
		}
		
		System.out.println(result == true ? "1" : "0");
	}
}
