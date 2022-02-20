package baekjoon;

import java.util.Scanner;

public class Baekjoon4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(); // �׽�Ʈ ���̽��� ����
		double[] percent = new double[c]; // �� �׽�Ʈ ���̽����� ����� �Ѵ� �л����� ���� (����� ��)
		
		for(int i = 0; i < c; i++) {
			int people = sc.nextInt();
			
			int[] scores = new int[people]; // �л����� ������ ������ �迭
			double avg = 0;
			int sum = 0;
			int count = 0;
			
			for(int j = 0; j < people; j++) {
				scores[j] = sc.nextInt();
				sum += scores[j];
			}
			
			avg = (double) sum / people;
			
			for(int j = 0; j < people; j++) {
				if(scores[j] > avg)
					count++;			
			}
			
			percent[i] = ((double) count/people)*100;
		}
		
		for(double i : percent) {
			System.out.printf("%03.3f%%\n", i);
		}
	}
}
