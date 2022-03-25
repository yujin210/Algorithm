package baekjoon;

import java.util.*;

public class Baekjoon5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] students = new int[28];
		ArrayList<Integer> arrlist = new ArrayList<>();
		int idx = 0;
		int num = 1;

		for(int i = 0; i < 28; i++) {
			students[i] = sc.nextInt();
		}
		
		Arrays.sort(students);
		
		while(idx <= 27) {
			if(students[idx] != num) {
				arrlist.add(num);
				num++;
			}
			idx++;
			num++;
		}
	
		while(arrlist.size() != 2) {
			arrlist.add(num);
			num++;
		}
		
		for(int i : arrlist) {
			System.out.println(i);
		}
		
	}
}
