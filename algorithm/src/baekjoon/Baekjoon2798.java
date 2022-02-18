package baekjoon;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Baekjoon2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 카드의 개수
		int m = sc.nextInt(); // 카드 합의 최댓값
		int[] card = new int[n];
		int sum = 0;
		ArrayList<Integer> arrlist = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			card[i] = sc.nextInt();
		}
		
		Arrays.sort(card);
		
		for(int i = 0; i < card.length; i++) {
			for(int j = n-1; j >= 0; j--) {
				for(int k = n-2; k >= 0; k--) {
					if(i != j && i != k && k != j) {
						sum = card[i] + card[j] + card[k];
						if(sum == m) {
							break;
						} else {
							arrlist.add(sum);
						}
					}
					
				}
				if(sum == m)
					break;
			}
			if(sum == m)
				break;
		}
		
		if(sum == m)
			System.out.println(sum);
		else {
			int[] temp = new int[arrlist.size()];
			int idx = 0;
			for(int i : arrlist) {
				temp[idx++] = i;
			}
			
			Arrays.sort(temp);
			
			for(int i = temp.length-1; i >= 0; i--) {
				if(temp[i] <= m) {
					System.out.println(temp[i]);
					break;
				}
			}
		}
	
	}
}
