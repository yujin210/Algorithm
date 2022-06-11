package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon4493 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int play = Integer.parseInt(br.readLine());
			String player1 = "";
			String player2 = "";
			int score1 = 0;
			int score2 = 0;
			
			for(int j = 0; j < play; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				player1 = st.nextToken();
				player2 = st.nextToken();
				
				if(player1.equals("R")) {
					if(player2.equals("P"))
						score2++;
					else if(player2.equals("S"))
						score1++;
				} else if (player1.equals("P")) {
					if(player2.equals("R"))
						score1++;
					else if(player2.equals("S"))
						score2++;
				} else {
					if(player2.equals("R"))
						score2++;
					else if (player2.equals("P"))
						score1++;
				}
			}
			
			System.out.println(score1 == score2 ? "TIE" : score1 > score2 ? "Player 1" : "Player 2");
		}
	}
}