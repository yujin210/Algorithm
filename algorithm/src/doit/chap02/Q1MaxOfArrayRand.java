package doit.chap02;

import java.util.Random;

public class Q1MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		int num = 1 + rand.nextInt(10); // nextInt(10) : 0~9까지의 숫자. 이때 0명인 경우를 방지하기 위해 1을 더해 1~10 사이의 숫자가 랜덤으로 지정되도록 했다.
		
		System.out.println("사람 수 : " + num);
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(99);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}
