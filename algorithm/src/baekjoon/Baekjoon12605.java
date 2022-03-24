package baekjoon;

import java.io.*;

public class Baekjoon12605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
				
		for(int i = 1; i <= n; i++) {
			String[] str = br.readLine().split(" ");
			
			System.out.print("Case #" + i + ":");
			for(int j = (str.length-1); j >= 0; j--) {
				if(j != 0) {
					System.out.print(" " + str[j]);
				} else {
					System.out.println(" " + str[j]);					
				}
			}
		}
	}
}
