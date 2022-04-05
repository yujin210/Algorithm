package baekjoon;

import java.util.Scanner;

public class Baekjoon10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int[] alphabet = new int[26]; // 각각의 알파벳이 처음 등장하는 위치를 저장할 배열
		
		for(int i = 0; i < 26; i++) {
			alphabet[i] = -1; // 문자열에 알파벳이 존재하지 않는 경우 -1을 출력하기 때문에 처음에 -1로 초기화 
		}
		
		for(int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);		
			ch %= 97;	// 소문자 알파벳을 10진수의 아스키코드로 표현했을 때 a=97이므로 97로 나눈 나머지를 구해서 배열의 인덱스로 사용 
			if(alphabet[ch] == -1) {	// 알파벳의 첫등장 위치를 저장하기 때문에, 동일한 문자가 중복되는 경우 덮어씌워지는 것을 방지
				alphabet[ch] = i;				
			}
		}
		
		for(int i = 0; i < 26; i++) {
			if(i != 25) {
				System.out.print(alphabet[i] + " ");
			} else {
				System.out.println(alphabet[i]);
			}
		}
	}
}