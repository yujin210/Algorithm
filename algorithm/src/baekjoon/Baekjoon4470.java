package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon4470 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int line = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= line; i++) {
			String str = br.readLine();
			System.out.println(i + ". " + str);
		}
	}
}