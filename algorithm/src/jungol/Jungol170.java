package jungol;

public class Jungol170 {
	public static void main(String[] args) {
		System.out.println("first");
		repeat();
		System.out.println("second");
		repeat();
		System.out.println("third");
		repeat();
	}
	static void repeat() {
		char at = '@';
		for(int i = 1; i <= 10; i++) {
			System.out.print(at);
		}
		System.out.println();
	}
} 
