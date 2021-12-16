package jungol;

import java.util.Scanner;

public class Jungol181 {
	public static void main(String[] args) {
		area();
	}
	
	static void area() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("radius : ");
		double radius = sc.nextDouble();
		
		double pi = 3.141592;
		double area = radius * radius * pi;
		System.out.println("area = " + Math.round(area*1000)/1000.0);
	}
}
