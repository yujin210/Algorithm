package baekjoon;

import java.util.*;

public class Baekjoon4949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> str = new ArrayList<>();
		
		while(true) {
			String s = sc.nextLine();

			if(s.equals(".")) {
				break;
			}
			
			str.add(s);
		}
		
		for(int i = 0; i < str.size(); i++) {
			balance(str.get(i));
		}
		
		
	}
	
	static void balance(String s) {
		Stack<Character> stack = new Stack<>();
		boolean state = false;
		
		if(!s.contains("(") && !s.contains(")") && !s.contains("[") && !s.contains("]")) {
			state = true;
		} else {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '(' || s.charAt(i) == '[') {
					stack.push(s.charAt(i));
				} else if (stack.size() != 0 && s.charAt(i) == ')') {
					if(stack.peek() == '(') {
						stack.pop();
					} else {
						stack.push(s.charAt(i));
					}
				} else if (stack.size() != 0 && s.charAt(i) == ']') {
					if(stack.peek() == '[') {
						stack.pop();
					} else {
						stack.push(s.charAt(i));
					}
				} else if (s.charAt(i) == ')' || s.charAt(i) == ']') {
					stack.push(s.charAt(i));
				}
			
			}
		}
		
		if(stack.size() == 0) {
			state = true;
		}
		
		System.out.println(state == true ? "yes" : "no");
	}
}
