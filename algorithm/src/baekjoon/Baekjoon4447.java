package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon4447 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String name = br.readLine();
			String str = name.toUpperCase();
			nameCheck(name, str);
		}
	}
	
	static void nameCheck(String name, String str) {
		int cntG = 0;
		int cntB = 0;

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == 'G')
				cntG++;
			else if (ch == 'B')
				cntB++;
		}
		
		if(cntG > cntB)
			System.out.printf("%s is GOOD\n", name);
		else if (cntB > cntG)
			System.out.printf("%s is A BADDY\n", name);
		else
			System.out.printf("%s is NEUTRAL\n", name);
	}
}