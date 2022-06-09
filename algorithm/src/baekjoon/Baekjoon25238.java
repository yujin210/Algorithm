package baekjoon;

import java.util.Scanner;

public class Baekjoon25238 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int monster = sc.nextInt();
		int percent = sc.nextInt();
		int damage = monster*(100-percent)/100;
		
		System.out.println(damage >= 100 ? 0 : 1);
	}
}