package jungol;

import java.util.Scanner;

public class Jungol599 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next().toUpperCase(); // �Է¹��� ���ڿ��� ��� �빮�ڷ� ����
		char ch;
		
		for(int i = 0; i < str.length(); i++) { // ���ڿ��� ���̸�ŭ �ݺ�
			ch = str.charAt(i); // ���ڿ��� i��° �ε����� �ش��ϴ� ���� ���� Ÿ���� ���� ch�� ����
			
			if(ch >= 65 && ch <= 90) { // ch�� �ƽ�Ű ���� �빮�� ���ĺ��̸�
				System.out.print(ch); // ch ���
			}
		}
	}
}
