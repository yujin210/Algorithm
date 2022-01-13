package programmers;

import java.util.Scanner;

public class Week2016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 프로그래머스 코드 시작
		String answer = "";
        
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 윤년 참고하여 각 달의 일 수를 배열로 생성
        int count = 0; // 날짜 수를 세기 위한 변수
        int week; // 요일 계산을 위한 변수
        
        for(int i = 0; i < a-1; i++) { // 1월부터 입력된 월의 전월까지의 일 수를 모두 더한다.
            count += month[i];
        }
        
        count += b; // 위에서 더한 값에 입력된 일 수를 더한다. (입력된 월의 일수이다.)
        
        week = count%7; // 요일을 맞추기 위해 7로 나눈 나머지 값을 저장한다.(1/1이 금요일이므로, 나머지 1은 금, 2는 토, ..., 7은 목요일이다.)
        
        switch(week) { // 요일에 해당하는 값 넣어주기
            case 1: 
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3: 
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            case 0, 7: // 7의 배수가 될 경우 값이 출력이 안되기 때문에 7의 배수일 경우 금요일 전날인 목요일이 되도록 설정
                answer = "THU";
                break;
            default:
                System.out.println("존재하지 않습니다");
        }
        
        // 프로그래머스 코드 끝

        System.out.println(answer);	
	}
}

