package doit.chap04;

import java.util.Scanner;

public class Q1IntStackTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (6)모두_삭제 (7)스택_용량_확인 (8)쌓인_데이터_수_확인 (9)isEmpty (10)isFull (0)종료 : ");
			
			int menu = sc.nextInt();
			
			if (menu == 0) break;
			
			int x;
			switch(menu) {
				case 1:		// 푸시
					try {
						System.out.print("데이터 : ");
						x = sc.nextInt();
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
					
				case 2:		// 팝
					try {
						x = s.pop();
						System.out.println("팝한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
					
				case 3:		// 피크
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
					
				case 4:		// 덤프
					s.dump();
					break;
					
				case 5:		// 검색
					System.out.print("검색할 데이터 : ");
					x = sc.nextInt();
					int result = s.indexOf(x);
					if (result == -1) 
						System.out.println("찾는 데이터가 스택에 존재하지 않습니다.");
					else 
						System.out.println("찾는 데이터는 " + result + "번 인덱스에 있습니다.");
					break;
					
				case 6:		// 모두 삭제
					s.clear();
					System.out.println("스택을 모두 비웠습니다.");
					break;
					
				case 7:		// 스택 용량 확인
					x = s.capacity();
					System.out.println("스택의 크기는 " + x + "입니다.");
					break;
					
				case 8:		// 쌓인 데이터 수 확인
					x = s.size();
					System.out.println("스택에 쌓인 데이터의 수는 " + x + "개 입니다.");
					break;
					
				case 9:		// isEmpty
					System.out.println("isEmpty? : " + s.isEmpty());
					break;
					
				case 10: 	// isFull
					System.out.println("isFull? : " + s.isFull());
					break;
					
				default : 
					System.out.println("잘못된 선택입니다.");
			}
		}
	}
}
