package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, Integer> name = new HashMap<>();
		HashMap<Integer, String> index = new HashMap<>();
		int idx = 1;
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			name.put(str, idx);
			index.put(idx++, str);
		}
		
		for(int i = 0; i < m; i++) {
			String s = br.readLine();
			if(Character.isDigit(s.charAt(0)) == true)
				System.out.println(index.get(Integer.parseInt(s)));
			else
				System.out.println(name.get(s));
		}
	}
}