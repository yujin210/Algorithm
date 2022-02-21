package baekjoon;

import java.util.Scanner;

public class Baekjoon1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		String[] date = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		int count = 0;
		
		if(month != 1) {
			for(int i = 1; i < month; i++) {
				switch(i) {
					case 1 :
					case 3 :
					case 5 : 
					case 7 :
					case 8 : 
					case 10 :
					case 12 :
						count += 31;
						break;
					case 2 :
						count += 28;
						break;
					case 4 :
					case 6 :
					case 9 :
					case 11 :
						count += 30;
						break;
						
					default : 
						count = -1;
				}
			}
		}
			
		count += day;
	
		int idx = count%7;

		if(idx == 0) {
			idx = 6;
		} else {
			idx--;
		}
		System.out.println(date[idx]);
	}
}
