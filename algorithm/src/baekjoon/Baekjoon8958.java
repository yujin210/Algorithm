package baekjoon;

import java.util.*;

public class Baekjoon8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] str = new String[num];
		int[] answer = new int[num]; // 결과 담을 배열
		int total = 0;
		int score = 1;
		char result;
		
		// 배열에 입력된 문자열 저장
		for(int i = 0; i < num; i++) {
			str[i] = sc.next();
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < str[i].length(); j++) {
				result = str[i].charAt(j);
				if(result == 'O') {
					total += score;
					score++;
				} else
					score = 1;
			}
			answer[i] = total;
			total = 0;
			score = 1;
		}
		
		for(int i : answer) {
			System.out.println(i);
		}
	}
}
