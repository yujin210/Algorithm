package doit.chap05;
import java.util.Scanner;
// 재귀 메서드 호출을 사용하지 않고 팩토리얼 구현하기

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
		
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}
}
