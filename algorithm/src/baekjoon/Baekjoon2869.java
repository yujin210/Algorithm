package baekjoon;

import java.util.Scanner;

public class Baekjoon2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // 낮에 올라갈 수 있는 높이 A
		int B = sc.nextInt(); // 밤에 미끄러지는 높이 B
		int V = sc.nextInt(); // 나무 막대 높이 V
		
		int day = 0; // 날짜 카운트
		
		V -= A; 
		day++;
			
		for(int i = 1; i <= V; i++) {
			day++;
		}
		
		System.out.println(day);
	}
}
