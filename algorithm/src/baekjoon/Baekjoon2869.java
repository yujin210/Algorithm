package baekjoon;

import java.util.Scanner;

public class Baekjoon2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // ���� �ö� �� �ִ� ���� A
		int B = sc.nextInt(); // �㿡 �̲������� ���� B
		int V = sc.nextInt(); // ���� ���� ���� V
		
		int day = 0; // ��¥ ī��Ʈ
		
		V -= A; 
		day++;
			
		for(int i = 1; i <= V; i++) {
			day++;
		}
		
		System.out.println(day);
	}
}
