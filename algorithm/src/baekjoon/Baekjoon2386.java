package baekjoon;

import java.util.Scanner;

public class Baekjoon2386 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		while(ch != '#') {
			String str = sc.nextLine();
			str = str.toLowerCase();
			//System.out.print(str);
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ch)
					count++;
			}
			
			System.out.printf("%c %d\n", ch, count);
			
			ch = sc.next().charAt(0);
		}	
	}
}