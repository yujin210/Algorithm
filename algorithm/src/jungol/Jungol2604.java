package jungol;

import java.util.Scanner;

public class Jungol2604 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String bowl = sc.next(); // 문자열 (그릇) 입력
		int height = 10; // 기본 접시의 높이 10
		String[] arr = new String[bowl.length()];
		
 		for(int i = 0; i < bowl.length(); i++) {
			arr[i] = bowl.substring(i, i+1); // 문자열 잘라서 배열에 넣기
		}
		
 		for (int i = 1; i < bowl.length(); i++) {
 			if (arr[i].equals(arr[i-1])) {
 				height += 5; 
 			} else {
 				height += 10;
 			}
 		}
 		System.out.println(height);
	}
}
