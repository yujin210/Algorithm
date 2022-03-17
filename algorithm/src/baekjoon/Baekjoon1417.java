package baekjoon;

import java.util.*;

public class Baekjoon1417 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		int answer = 0;
		int number = 1;
		
		if(n == 1) {
			answer = 0;
		} else {
			for(int i = 0; i < n; i++) {
				map.put(number++, sc.nextInt());
			}
			
			int max;
			boolean same = false;
			
			do {
				max = max(map);
				same = same(map);
				if(max == 1 && same == false) {
					break;
				} else {
					int temp = map.get(max);
					int first = map.get(1);
					map.replace(max, --temp);
					map.replace(1, ++first);
					answer++;
				}
			} while(max != 1);
				
		}
		
		System.out.println(answer);
	}
	
	static int max(HashMap<Integer, Integer> map) {
		int max = (int) map.get(1);
		int key = 1;
		for(int i = 2; i <= map.size(); i++) {
			if(max < (int) map.get(i)) {
				max = (int) map.get(i);
				key = i;
			}
		}
		
		return key;
	}
	
	static boolean same(HashMap<Integer, Integer> map) {
		boolean result = false;
		for(int i = 2; i <= map.size(); i++) {
			if(map.get(1) == map.get(i)) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
}
