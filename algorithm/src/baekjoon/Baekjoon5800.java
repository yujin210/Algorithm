package baekjoon;

import java.util.*;

public class Baekjoon5800 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		
		for(int i = 0; i < k; i++) {
			int n = sc.nextInt();
			Integer[] arr = new Integer[n];
			for(int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			
			int max = max(arr);
			int min = min(arr);
			Arrays.sort(arr, Collections.reverseOrder());
			int gap = gap(arr); 
			System.out.println("Class " + (i+1));
			System.out.printf("Max %d, Min %d, Largest gap %d\n", max, min, gap);
		}
	}
	
	static int max(Integer[] num) {
		int max = num[0];
		for(int i = 1; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		
		return max;
	}
	
	static int min(Integer[] num) {
		int min = num[0];
		for(int i = 1; i < num.length; i++) {
			if(min > num[i]) {
				min = num[i];
			}
		}
		
		return min;
	}
	
	static int gap(Integer[] num) {
		int gap = num[0] - num[1];
		
		for(int i = 1; i < num.length-1; i++) {
			if(gap < (num[i] - num[i+1]))
				gap = (num[i] - num[i+1]);
		}
		
		return gap;
	}
}
