package baekjoon;

import java.util.Scanner;

public class Baekjoon15781 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] helmet = new int[n];
		int[] vest = new int[m];
		int maxH = 0;
		int maxV = 0;
		
		for(int i = 0; i < n; i++) {
			helmet[i] = sc.nextInt();
			
			if(helmet[i] > maxH)
				maxH = helmet[i];
		}
		
		for(int i = 0; i < m; i++) {
			vest[i] = sc.nextInt();
			
			if(vest[i] > maxV)
				maxV = vest[i];
		}
		
		System.out.println(maxH + maxV);
	}
}