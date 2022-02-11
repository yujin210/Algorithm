package baekjoon;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Baekjoon3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10]; // �Է� ������ �迭
		ArrayList<Integer> arrlist = new ArrayList<>(); // 42�� ���� ������ ������ ArrayList
		ArrayList<Integer> count = new ArrayList<>();	// ���� �ٸ� �� ������ ArrayList
		
		// �Է� �޾Ƽ� �迭�� ���� ��, 42�� ���� ������ ����
		for(int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			arrlist.add(input[i]%42);
		}
		
		// 42�� ���� ���������� �ӽ� �迭 temp�� ����ֱ�
		int idx = 0;
		int[] temp = new int[arrlist.size()];
		for(int i : arrlist) {
			temp[idx++] = i;
		}
		
		// ���� ���� �� ���ؼ� ����
		Arrays.sort(temp);
		
		// ���� ���� �ٸ��� ArrayList�� �߰�
		count.add(temp[0]);
		
		for(int i = 1; i < temp.length; i++) {
			if(temp[i-1] != temp[i])
				count.add(temp[i]);
		}
		
		// ���� �ٸ� ���� ���� ArrayList�� ũ�� ���
		System.out.println(count.size());
	}
}
