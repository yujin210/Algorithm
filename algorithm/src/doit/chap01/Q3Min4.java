package doit.chap01;

public class Q3Min4 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		if(min > d) {
			min = d;
		}
		
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min4(1, 2, 3, 4) = " + min4(1, 2, 3, 4));
		System.out.println("min4(1, 2, 4, 3) = " + min4(1, 2, 4, 3));
		System.out.println("min4(1, 3, 2, 4) = " + min4(1, 3, 2, 4));
		System.out.println("min4(1, 3, 4, 2) = " + min4(1, 3, 4, 2));
		System.out.println("min4(1, 4, 2, 3) = " + min4(1, 4, 2, 3));
		System.out.println("min4(1, 4, 3, 2) = " + min4(1, 4, 3, 2));
		System.out.println();
		System.out.println("min4(2, 1, 3, 4) = " + min4(2, 1, 3, 4));
		System.out.println("min4(2, 1, 4, 3) = " + min4(2, 1, 4, 3));
		System.out.println("min4(2, 3, 1, 4) = " + min4(2, 3, 1, 4));
		System.out.println("min4(2, 3, 4, 1) = " + min4(2, 3, 4, 1));
		System.out.println("min4(2, 4, 1, 3) = " + min4(2, 4, 1, 3));
		System.out.println("min4(2, 4, 3, 1) = " + min4(2, 4, 3, 1));
		System.out.println();
		System.out.println("min4(3, 1, 2, 4) = " + min4(3, 1, 2, 4));
		System.out.println("min4(3, 1, 4, 2) = " + min4(3, 1, 4, 2));
		System.out.println("min4(3, 2, 1, 4) = " + min4(3, 2, 1, 4));
		System.out.println("min4(3, 2, 4, 1) = " + min4(3, 2, 4, 1));
		System.out.println("min4(3, 4, 1, 2) = " + min4(3, 4, 1, 2));
		System.out.println("min4(3, 4, 2, 1) = " + min4(3, 4, 2, 1));
		System.out.println();
		System.out.println("min4(4, 1, 2, 3) = " + min4(4, 1, 2, 3));
		System.out.println("min4(4, 1, 3, 2) = " + min4(4, 1, 3, 2));
		System.out.println("min4(4, 2, 1, 3) = " + min4(4, 2, 1, 3));
		System.out.println("min4(4, 2, 3, 1) = " + min4(4, 2, 3, 1));
		System.out.println("min4(4, 3, 1, 2) = " + min4(4, 3, 1, 2));
		System.out.println("min4(4, 3, 2, 1) = " + min4(4, 3, 2, 1));
		System.out.println();
	}
}
