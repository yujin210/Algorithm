package baekjoon;

import java.util.Scanner;

public class Baekjoon1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cycle = 0;
		int num1 = 0;		
		int left = 0; // 기존 수의 1의 자리
		int right = 0; // 새로 입력 되는 수의 1의 자리
		int sum = 0;
		
		num1 = sc.nextInt(); // 첫 번째 입력
		if (num1 < 10) { // 주어진 수가 10보다 작으면 
			left = 0; // 앞에 0을 붙인다.
			right = num1; 
			sum = left + right; // 각 자리 수를 더한다.
		} else {
			left = num1 / 10;
			right = num1 % 10;
			sum = left + right;
		}
		cycle++;
		
		while(true) {
			int num2 = (left*10) + right;
			if(num2 < 10) {
				left = num2; // 주어진 수의 가장 오른쪽 자리 수
				right = sum % 10; // 앞에서 구한 합의 가장 오른쪽 자리 수
				sum = left + right;
				
				if ((left*10) + right == num1) {
					break;
				}
				cycle++;
			} else {
				left = num2 % 10;
				right = sum % 10;
				sum = left + right;
				
				if ((left*10) + right == num1) {
					break;
				}
				cycle++;
			}
		}
		
		System.out.println(cycle);
		
	}

}		


