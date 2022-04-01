package baekjoon;

import java.util.Scanner;

public class Baekjoon11365 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			String decrypt = "";
			
			if(str.equals("END")) {
				break;
			} else {
				for(int i = str.length()-1; i >= 0; i--) {
					decrypt += str.charAt(i);
				}
				System.out.println(decrypt);
			}
		}
	}
}