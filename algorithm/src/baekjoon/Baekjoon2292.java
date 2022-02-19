package baekjoon;

import java.util.Scanner;

public class Baekjoon2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 방의 번호
		int room = 1; // 방의 단계 (결과값)
		
		// 범위
		int front = 1; // 시작
		int back = 1;  // 끝
		
		while(n < front || n > back) {
			room++;
			front = back + 1;
			back = front+(6*room)-6-1;
			// System.out.printf("room : %d, front : %d, back : %d\n", room, front, back);
			if(n >= front && n <= back) {
				break;
			}
		}
		
		System.out.println(room);
	}
}
