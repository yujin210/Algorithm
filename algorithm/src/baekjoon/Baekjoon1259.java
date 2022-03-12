package baekjoon;

import java.util.*;

public class Baekjoon1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			if(num == 0)
				break;
			else {
				ArrayList<Integer> arrlist = new ArrayList<>();

				while(num != 0) {
					arrlist.add(num%10);
					num /= 10;
				}
				
				int[] arr = new int[arrlist.size()];
				int idx = 0;
				for(int i : arrlist) {
					arr[idx++] = i;
				}
				
				compare(arr);
			}
		}
	}
	
	static void compare(int[] arr) {
		boolean result = true;
		int size = arr.length-1;		
		for(int i = 0; i <= arr.length/2; i++) {
			if(arr[i] != arr[size--]) {
				result = false;
				break;
			}
		}
		
		if(result == false)
			System.out.println("no");
		else
			System.out.println("yes");
	}
}
