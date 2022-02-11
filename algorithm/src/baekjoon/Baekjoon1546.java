package baekjoon;

import java.util.*;

public class Baekjoon1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] subject = new int[num];
		double sum = 0;
		
		// 점수를 배열에 저장
		for(int i = 0; i < num; i++) {
			subject[i] = sc.nextInt();
		}
		
		int max = subject[0];
		
		// 점수의 최댓값 구하기
		for(int i = 1; i < num; i++) {
			if(max < subject[i])
				max = subject[i]; 
		}
		
		double temp;
		
		for(int i = 0; i < num; i++) {
			temp = (double) subject[i]/max;
			temp *= 100;
			sum += temp;
		}

		System.out.println(sum/num);
	}
}
