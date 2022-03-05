package baekjoon;

import java.util.*;

public class Baekjoon11557 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; i++) {
			HashMap<Integer, String> map = new HashMap<>();
			ArrayList<Integer> arrlist = new ArrayList<>();
			int totalCase = sc.nextInt();
			String name = "";
			int amount = 0;
			
			for(int j = 0; j < totalCase; j++) {
				name = sc.next();
				amount = sc.nextInt();
				arrlist.add(amount);
				map.put(amount, name);
			}
			
			int max = arrlist.get(0);
			for(int k = 1; k < totalCase; k++) {
				if(max < arrlist.get(k)) {
					max = arrlist.get(k);
				}
			}
			
			System.out.println(map.get(max));
		}
	}
}
