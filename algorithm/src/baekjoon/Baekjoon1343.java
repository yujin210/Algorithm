package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon1343 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder answer = new StringBuilder();
		
		String board = br.readLine();
		int countX = 0;
		
		for(int i = 0; i < board.length(); i++) {
			if(board.charAt(i) == 'X') {
				countX++;
			} else {
				if(countX % 2 == 1) {
					answer = new StringBuilder();
					answer.append(-1);
					break;
				} else {
					while(countX != 0) {
						if(countX >= 4) {
							answer.append("AAAA");
							countX -= 4;
						} else {
							answer.append("BB");
							countX -= 2;
						}
					}
					
					answer.append(".");
				}
			}
		}
		
		if(countX > 0) {
			if(countX % 2 == 1) {
				answer = new StringBuilder();
				answer.append(-1);
			} else {
				while(countX != 0) {
					if(countX >= 4) {
						answer.append("AAAA");
						countX -= 4;
					} else {
						answer.append("BB");
						countX -= 2;
					}
				}
			}
		}
		
		answer.append("\n");
		bw.write(answer.toString());
		bw.flush();
		
		br.close();
		bw.close();
		
	}

}