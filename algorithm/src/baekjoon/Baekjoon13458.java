package baekjoon;

import java.util.Scanner;

public class Baekjoon13458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 시험장의 개수 
		int[] people = new int[n];
		
		for(int i = 0; i < n; i++) {
			people[i] = sc.nextInt();
		}
		
		int first = sc.nextInt();  // 총감독관이 감독 가능한 인원 
		int second = sc.nextInt(); // 부감독관이 감독 가능한 인원 
		
		long answer = 0;
		
		for(int i = 0; i < n; i++) {
			people[i] -= first; // 총감독관이 감독하는 인원은 제외시킴 
			answer++;			// 감독관 수 +1 (총감독관) 
			
			if(people[i] <= 0)
				continue;
			else {
				answer += people[i]/second;
				if(people[i]%second > 0)
					answer++;
			}
		}
		
		System.out.println(answer);
	}
}