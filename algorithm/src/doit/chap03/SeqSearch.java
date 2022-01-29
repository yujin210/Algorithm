package doit.chap03;
import java.util.Scanner;
// 선형 검색

public class SeqSearch {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
	static int seqSearch(int[] a, int key) {
		for(int i = 0; i < a.length; i++) {
			if(key == a[i])
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num]; // 요솟수가 num개인 배열 x 생성
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		if(seqSearch(x, key) == -1)
			System.out.println("그 값으 요소가 없습니다.");
		else 
			System.out.println(key + "은(는) x[" + seqSearch(x, key) + "]에 있습니다.");
		
	}
}
