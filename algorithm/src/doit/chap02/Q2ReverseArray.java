package doit.chap02;
import java.util.Scanner;
import java.util.Random;
// 배열 요소를 역순으로 정렬하는 과정을 하나씩 나타내는 프로그램 작성

public class Q2ReverseArray {
	// 배열의 요소를 바꾸는 메서드
	static void swap(int[] x, int idx1, int idx2) {
		int temp = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = temp;
	}
	
	// 배열을 역순으로 정렬하는 메서드
	static void reverse(int[] x) {
		for(int i = 0; i < x.length/2; i++) {
			System.out.println("a[" + i + "]과(와) a[" + (x.length-i-1) + "]를 교환합니다.");
			swap(x, i, x.length-i-1);
			
			for(int j = 0; j < x.length; j++) {
				System.out.print(x[j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] array = new int[num];
		
		for(int i = 0; i < num; i++) {
			array[i] = 1 + rand.nextInt(100); // 배열 요소의 값을 1~100사이의 난수로 생성
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		reverse(array);	
	}
}
