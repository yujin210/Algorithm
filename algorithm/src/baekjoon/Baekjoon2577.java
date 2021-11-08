package baekjoon;

import java.util.Scanner;

public class Baekjoon2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[10]; // 0~9에 해당하는 수 저장할 배열

		String mul = Integer.toString(a*b*c); // a*b*c의 곱을 문자열 타입으로 저장
		for(int i = 0; i < mul.length(); i++) {
			char num = mul.charAt(i); // 문자열 타입을 charAt() 메서드 사용하여 문자 타입으로 변환
			arr[num - '0']++; // 아스키 코드 활용하여 변환시킨 값을 해당하는 배열에 넣어줌
			num = 0;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
