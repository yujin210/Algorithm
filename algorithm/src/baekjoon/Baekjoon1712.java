package baekjoon;

import java.util.Scanner;

public class Baekjoon1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 고정비용
		int b = sc.nextInt(); // 가변비용
		int c = sc.nextInt(); // 판매가
		
		int count = 0; 		  // 최초 이익이 발생하는 판매량 (손익분기점)
		
		if(b >= c) {
			count = -1;
		} else {
			while((c-b)*count <= a) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
