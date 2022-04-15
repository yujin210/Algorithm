package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baekjoon1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<String> hs = new HashSet<>();
		ArrayList<String> arrlist = new ArrayList<>();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
				
		for(int i = 0; i < n; i++) {
			hs.add(br.readLine());
		}
		
		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			if(hs.contains(str))
				arrlist.add(str);
		}
		
		Collections.sort(arrlist);
		System.out.println(arrlist.size());
		for(String s : arrlist) {
			System.out.println(s);
		}
	}
}