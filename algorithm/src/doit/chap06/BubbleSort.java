package doit.chap06;
import java.util.Scanner;
// 버블 정렬(버전 1)

public class BubbleSort {
	//a[idx1]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	// 버블 정렬
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n-1; i++) {		// 0부터 n-2까지 총 n-1회 반복
			for(int j = n-1; j > i; j--) {	// 배열의 가장 마지막 요소부터 정렬을 시작하므로 j의 시작 값은 n-1이다. 
											// j는 오른쪽 값을 기준으로 하기 때문에 종료 값은 i + 1이다. (i 앞의 요소는 이미 정렬이 완료되었다고 가정한다.) 
				if(a[j-1] > a[j])
					swap(a, j-1, j);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 1)");
		
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, nx);	// 배열 x를 버블 정렬합니다.
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
