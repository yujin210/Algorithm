package doit.chap02;
import java.util.Scanner;
// 두 배열이 같은가를 판단

public class ArrayEqual {
	
	// 두 배열 a, b의 모든 요소가 같은가?
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)	// 두 배열의 길이가 다르면 두 배열은 다른 배열이 확실하므로 false 반환
			return false;
		
		for(int i = 0; i < a.length; i++) {	// 두 배열의 길이가 같다면 각 배열의 모든 요소를 하나씩 비교한다.
			if(a[i] != b[i])	// 각 요소의 값이 다르면 false 반환
				return false;
		}
		
		return true;	// 위에서 걸리지 않고 코드가 끝까지 실행됐다면 두 배열은 같으므로 true 반환
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = sc.nextInt();	// 배열 a의 요솟수
		int[] a = new int[na];	// 요솟수가 na인 배열
		
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = sc.nextInt();	// 배열 b의 요솟수
		int[] b = new int[nb];	// 요솟수가 nb인 배열
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다." : "다릅니다."));
	}
}
