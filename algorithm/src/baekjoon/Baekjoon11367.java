package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11367 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			
			if(score <= 100 && score >= 97)
				System.out.printf("%s %s\n", name, "A+");
			else if(score <= 96 && score >= 90)
				System.out.printf("%s %s\n", name, "A");
			else if(score <= 89 && score >= 87)
				System.out.printf("%s %s\n", name, "B+");
			else if(score <= 86 && score >= 80)
				System.out.printf("%s %s\n", name, "B");
			else if(score <= 79 && score >= 77)
				System.out.printf("%s %s\n", name, "C+");
			else if(score <= 76 && score >= 70)
				System.out.printf("%s %s\n", name, "C");
			else if(score <= 69 && score >= 67)
				System.out.printf("%s %s\n", name, "D+");
			else if(score <= 66 && score >= 60)
				System.out.printf("%s %s\n", name, "D");
			else if(score <= 59 && score >= 0)
				System.out.printf("%s %s\n", name, "F");
		}
	}
}