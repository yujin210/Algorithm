package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10214 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int scoreY = 0;
		int scoreK = 0;
		
		for(int i = 0; i < testCase; i++) {
			for(int j = 0; j < 9; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				scoreY += Integer.parseInt(st.nextToken());
				scoreK += Integer.parseInt(st.nextToken());
			}
			
			System.out.println(scoreY == scoreK ? "Draw" : scoreY > scoreK ? "Yonsei" : "Korea");
			
			scoreY = 0;
			scoreK = 0;
		}
	}
}