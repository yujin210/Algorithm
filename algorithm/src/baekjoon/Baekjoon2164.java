package baekjoon;

import java.util.*;

public class Baekjoon2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		int temp = 0;
		
		for(int i = 1; i <= n; i++) {
			que.add(i);
		}
		
		while(que.size() != 1) {
			que.remove();
			temp = que.peek();
			que.remove();
			que.add(temp);
		}
		
		System.out.println(que.remove());
	}
}
