package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.next();
		String num2 = sc.next();
		
		BigInteger big1 = new BigInteger(num1);
		BigInteger big2 = new BigInteger(num2);
		
		System.out.println(big1.add(big2));
	}
}
