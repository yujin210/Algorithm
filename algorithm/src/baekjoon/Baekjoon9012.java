package baekjoon;

import java.util.*;

public class Baekjoon9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(vps(sc.next()) == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	
	static int vps(String ps) {
		Stack<Character> st = new Stack<>();
		
		char ch = ps.charAt(0);
		if(ch == ')')
			return -1;
		else {
			st.push(ch);
			for(int i = 1; i < ps.length(); i++) {
				if(st.size() != 0 && st.peek() == '(' && ps.charAt(i) == ')') {
					st.pop();
				} else {
					st.push(ps.charAt(i));
				}
			}
			
			if(st.size() == 0)
				return 1;
			else 
				return -1;
		}
	}
}
