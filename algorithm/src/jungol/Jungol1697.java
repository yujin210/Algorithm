package jungol;

import java.util.Scanner;

public class Jungol1697 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		Queue que = new Queue(num);
		
		for(int i = 0; i < num; i++) {
			char menu = sc.next().charAt(0);
			
			switch(menu) {
				case 'i' :
					int x = sc.nextInt();
					que.enque(x);
					break;
					
				case 'o' : 
					x = que.deque();
					if (x == -1)
						System.out.println("empty");
					else 
						System.out.println(x);
					break;
					
				case 'c' : 
					System.out.println(que.size());
					break;
			}
		}
	}
}

class Queue {
		int max;
		int front;
		int rear;
		int num;
		int[] que;
		
		public Queue(int capacity) {
			max = capacity;
			front = rear = num = 0;
			que = new int[max];
		}
		
		public void enque(int x) {
			que[rear++] = x;
			num++;
			
			if (rear >= max)
				rear = 0;
		}
		
		public int deque() {
			if(num <= 0)
				return -1;
			else {
				int x = que[front++];
				num--;
				if (front >= max)
					front = 0;
				return x;
			}
			
		}
		
		public int size() {
			return num;
		}
}