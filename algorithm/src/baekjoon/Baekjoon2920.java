package baekjoon;

import java.util.*;

public class Baekjoon2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] major = new int[8];
		
		for(int i = 0; i < 8; i++) {
			major[i] = sc.nextInt();
		}
		
		if(major[0] == 8) {
			if (desc(major) == true)
				System.out.println("descending");
			else
				System.out.println("mixed");
		} else if(major[0] == 1) {
			if(asc(major) == true) {
				System.out.println("ascending");
			} else
				System.out.println("mixed");
		} else
			System.out.println("mixed");
	}
	
	static boolean asc(int[] major) {
		int[] asc = {1,2,3,4,5,6,7,8};
		boolean result = true;
		
		for(int i = 0; i < 8; i++) {
			if(asc[i] != major[i]) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	static boolean desc(int[] major) {
		int[] desc = {8,7,6,5,4,3,2,1};
		boolean result = true;
		
		for(int i = 0; i < 8; i++) {
			if(desc[i] != major[i]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
