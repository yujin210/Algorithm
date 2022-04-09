package baekjoon;

import java.util.Scanner;

public class Baekjoon2810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int people = sc.nextInt();
		String seat = sc.next();
		int holder = 1; // 양쪽 끝 좌석에는 홀더가 하나씩 있으므로 가장 왼쪽 좌석에 있는 홀더 1
		int countL = 0;
		
		for(int i = 0; i < people; i++) {
			char ch = seat.charAt(i);
			if(ch == 'S' || countL == 1) {
				holder++;
				countL = 0;
			} else {
				countL++;
			}
		}
		
		System.out.println(holder >= people ? people : holder);
	}
}