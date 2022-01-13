package jungol;

import java.util.Scanner;

public class Jungol599 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next().toUpperCase(); // 입력받은 문자열을 모두 대문자로 변경
		char ch;
		
		for(int i = 0; i < str.length(); i++) { // 문자열의 길이만큼 반복
			ch = str.charAt(i); // 문자열의 i번째 인덱스에 해당하는 값을 문자 타입의 변수 ch에 저장
			
			if(ch >= 65 && ch <= 90) { // ch의 아스키 값이 대문자 알파벳이면
				System.out.print(ch); // ch 출력
			}
		}
	}
}
