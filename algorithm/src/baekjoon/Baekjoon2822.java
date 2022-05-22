package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Baekjoon2822 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i = 1; i <= 8; i++) {
			map.put(sc.nextInt(), i);
		}
	
		int cnt = 0;
		for(Integer i : map.descendingMap().keySet()) {
			if(cnt > 4)
				break;
			sum += i;
			nums.add(map.get(i));
			cnt++;
		}
		
		Collections.sort(nums);
		
		System.out.println(sum);
		for(int i : nums) {
			System.out.print(i + " ");
		}
	}
}