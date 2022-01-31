package jungol;

import java.util.Scanner;

public class Jungol1102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		Stack s = new Stack(num);
		
		for(int i = 0; i < num; i++) {
			char menu = sc.next().charAt(0);
			
			switch(menu) {
				case 'i' : 
					int x = sc.nextInt();
					s.push(x);
					break;
					
				case 'o' : 
					int result = s.pop();
					if(result == -1) {
						System.out.println("empty");
					} else {
						System.out.println(result);
					}
					break;
					
				case 'c' : 
					System.out.println(s.size());
			}
		}
	}
	
	
}

class Stack {
	int max;
	int ptr;
	int[] stk;
	
	public Stack(int capacity) {
		max = capacity;
		ptr = 0;
		stk = new int[max];		
	}
	
	public void push(int x) {
		stk[ptr++] = x;
	}
	
	public int pop() {
		if (ptr <= 0)
			return -1;
		else 
			return stk[--ptr];
	}
	
	public int size() {
		return ptr;
	}
}
