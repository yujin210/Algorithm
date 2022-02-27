package baekjoon;

import java.util.*;

public class Baekjoon22966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int level = 0;
		String subject = "";
		int[] lv = new int[n];
		HashMap<Integer, String> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			subject = sc.next();
			level = sc.nextInt();
			
			map.put(level, subject);
			lv[i] = level;
		}
		
		Arrays.sort(lv);
		
		System.out.println(map.get(lv[0]));
	}
}
