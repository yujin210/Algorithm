package doit.chap05;
import java.util.Scanner;
// ��� �޼��� ȣ���� ������� �ʰ� ���丮�� �����ϱ�

public class Q1Factorial {
	static int factorial(int x) {
		int result = 1;
		
		if (x == 0)
			return 1;
		else {
			for(int i = x; i >= 1; i--) {
				result *= i;
			}
			return result;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		System.out.println(x + "�� ���丮���� " + factorial(x) + "�Դϴ�.");
	}
}
