package baekjoon;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Baekjoon3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10]; // 입력 저장할 배열
		ArrayList<Integer> arrlist = new ArrayList<>(); // 42로 나눈 나머지 저장할 ArrayList
		ArrayList<Integer> count = new ArrayList<>();	// 서로 다른 값 저장할 ArrayList
		
		// 입력 받아서 배열에 저장 후, 42로 나눈 나머지 저장
		for(int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			arrlist.add(input[i]%42);
		}
		
		// 42로 나눈 나머지들을 임시 배열 temp에 담아주기
		int idx = 0;
		int[] temp = new int[arrlist.size()];
		for(int i : arrlist) {
			temp[idx++] = i;
		}
		
		// 앞의 값과 비교 위해서 정렬
		Arrays.sort(temp);
		
		// 앞의 값과 다르면 ArrayList에 추가
		count.add(temp[0]);
		
		for(int i = 1; i < temp.length; i++) {
			if(temp[i-1] != temp[i])
				count.add(temp[i]);
		}
		
		// 서로 다른 값을 담은 ArrayList의 크기 출력
		System.out.println(count.size());
	}
}
