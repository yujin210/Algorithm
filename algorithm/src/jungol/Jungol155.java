package jungol;

import java.util.Scanner;

public class Jungol155 {
	public static void main(String[] args) {
		char[] arr = {'J', 'U', 'N', 'G', 'O', 'L'};
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); // 문자열로 입력받아서
		char ch = str.charAt(0); // 문자로 바꿔주기
		boolean print = true;
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.println(i);
				print = true;
				break;
			} else {
				print = false;
			}
		}
		
		if (print == false) {
			System.out.println("none");
		}
	}

}
