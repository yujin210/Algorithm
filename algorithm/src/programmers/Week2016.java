package programmers;

import java.util.Scanner;

public class Week2016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// ���α׷��ӽ� �ڵ� ����
		String answer = "";
        
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // ���� �����Ͽ� �� ���� �� ���� �迭�� ����
        int count = 0; // ��¥ ���� ���� ���� ����
        int week; // ���� ����� ���� ����
        
        for(int i = 0; i < a-1; i++) { // 1������ �Էµ� ���� ���������� �� ���� ��� ���Ѵ�.
            count += month[i];
        }
        
        count += b; // ������ ���� ���� �Էµ� �� ���� ���Ѵ�. (�Էµ� ���� �ϼ��̴�.)
        
        week = count%7; // ������ ���߱� ���� 7�� ���� ������ ���� �����Ѵ�.(1/1�� �ݿ����̹Ƿ�, ������ 1�� ��, 2�� ��, ..., 7�� ������̴�.)
        
        switch(week) { // ���Ͽ� �ش��ϴ� �� �־��ֱ�
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
            case 0, 7: // 7�� ����� �� ��� ���� ����� �ȵǱ� ������ 7�� ����� ��� �ݿ��� ������ ������� �ǵ��� ����
                answer = "THU";
                break;
            default:
                System.out.println("�������� �ʽ��ϴ�");
        }
        
        // ���α׷��ӽ� �ڵ� ��

        System.out.println(answer);	
	}
}

