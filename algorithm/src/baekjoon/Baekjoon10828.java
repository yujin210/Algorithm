package baekjoon;

import java.util.Scanner;

public class Baekjoon10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    final int N = sc.nextInt();
	    int x = 0;

	    IntStacks s = new IntStacks(100000);

	    for(int i = 1; i <= N; i++) {
	      String command = sc.next();

	      switch(command) {
	        case "push":
	          x = sc.nextInt();
	          s.push(x);
	          break;

	        case "pop":
	          x = s.pop();
	          System.out.println(x);
	          break;

	        case "size":
	          x = s.size();
	          System.out.println(x);
	          break;

	        case "empty":
	          x = s.empty();
	          System.out.println(x);
	          break;

	        case "top":
	          x = s.top();
	          System.out.println(x);
	          break;
	      }
	    }

	}

}

class IntStacks {
	  private int max;
	  private int ptr;
	  private int[] stk;

	  // »ý¼ºÀÚ
	  public IntStacks(int capacity) {
	    max = capacity;
	    ptr = 0;
	    stk = new int[max];
	  }

	  // push
	  public void push(int x) {
	    stk[ptr++] = x;
	  }

	  // pop
	  public int pop() {
	    if (ptr <= 0)
	      return -1;
	    else
	      return stk[--ptr];    
	  }

	  // size
	  public int size() {
	    if (ptr <= 0)
	      return 0;
	    else
	      return ptr;
	  }

	  // empty
	  public int empty() {
	    return (ptr <= 0) ? 1 : 0;
	  }

	  // top
	  public int top() {
	    if (ptr <= 0)
	      return -1;
	    else
	      return stk[ptr - 1];
	  }
}