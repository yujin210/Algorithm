package baekjoon;

import java.util.*;

public class Baekjoon1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> arrlist = new ArrayList<>();
		
		while(n != 0) {
			int digit = n%10;
			arrlist.add(digit);
			n /= 10;
		}
		
		Collections.sort(arrlist, Collections.reverseOrder()) ;
		
		for(int i : arrlist) {
			System.out.print(i);
		}
	}
}