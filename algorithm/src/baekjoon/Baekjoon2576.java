package baekjoon;

import java.util.*;

public class Baekjoon2576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> odd = new ArrayList<>();
		int sum = 0;
		
		for(int i = 0; i < 7; i++) {
			int num = sc.nextInt();
			
			if(num%2 != 0) {
				odd.add(num);
				sum += num;
			}
				
		}
		
		if(odd.size() == 0)
			System.out.println(-1);
		else {			
			Collections.sort(odd);
			
			System.out.println(sum);
			System.out.println(odd.get(0));
		}
	}
}
