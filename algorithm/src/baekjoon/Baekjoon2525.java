package baekjoon;

import java.util.*;

public class Baekjoon2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();	// ���� ��
		int min = sc.nextInt();		// ���� ��
		int time = sc.nextInt();	// �ҿ� �ð�
		
		if(min + time < 60) {
			min += time;
		} else if ((min+time)%60 == 0) {
			hour += ((min+time)/60);
			min = 0;
		} else {
			int temp = min+time;
			while(temp >= 60) {
				temp -= 60;
				hour++;
			}
			min = temp;
		}
		if(hour >= 24) {
			hour %= 24;
		}
		System.out.printf("%d %d", hour, min);
	}
}
