package baekjoon;

import java.util.Scanner;

public class Baekjoon1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int[] alphabet = new int[26];
		
		str = str.toUpperCase();
		for(int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			ch %= 65;
			alphabet[ch]++;
		}
		
		int idx = max(alphabet);
		
		if(idx == -1) {
			System.out.println("?");
		} else {
			char c = (char) (idx+65);
			System.out.println(c);
		}
	}
	
	static int max(int[] arr) {
		int max = arr[0];
		int idx = 0;
		int same = 0;
		
		for(int i = 1; i < 26; i++) {
			if(max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			if(max == arr[i]) {
				same++;
			}
		}
		
		if(same >= 2) { // 사용횟수가 여러 개인 경우 ?를 표시해야 하므로 idx에 -1을 저장 
			idx = -1;
		}
		
		return idx;
	}
}