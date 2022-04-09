package baekjoon;

import java.util.Scanner;

public class Baekjoon4796 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idx = 1;
		while(true) {
			int l = sc.nextInt(); // 사용가능한 일 수
			int p = sc.nextInt(); // 연속되는 일 수
			int v = sc.nextInt(); // 휴가기간
			
			if(l == 0 && p == 0 && v == 0)
				break;
			else {
				camping(l, p, v, idx);	
				idx++;
			}
		}
	}
	
	static void camping(int l, int p, int v, int idx) {
		int answer = 0;
		int no = p - l; // 연속되는 기간 동안 사용 불가한 일 수
		
		while(v != 0) {
			if(v >= p) {
				answer += l;
				v -= p;
			} else {
				if(l >= v) {
					answer += v;
				} else {
					answer += l;
				}
				
				v -= v;
			}
		}
		
		System.out.printf("Case %d: %d\n", idx, answer);		
	}
}