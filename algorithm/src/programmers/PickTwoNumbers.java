package programmers;

import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrlist = new ArrayList<>();  // �� ���� �� ���ؼ� ���� �� �ִ� ��� �� ���� (�ߺ� ���)
        ArrayList<Integer> distinct = new ArrayList<>(); // arrlist���� �ߺ� ���� �� ����

        // �� ���� �� ���ؼ� ���� �� �ִ� ��� �� arrlist�� ����
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                    arrlist.add(numbers[i] + numbers[j]);
            }
        }
        
        // �ӽ� �迭 temp�� arrlist �ű�
        int[] temp = new int[arrlist.size()];
        int idx = 0;
        
        for(int i : arrlist) {
            temp[idx++] = i;
        }
        
        // �ߺ� ���� �� ���� ���� �� & answer�� ������������ ��� ���� ����
        Arrays.sort(temp);
        
        // �迭 temp���� �ε��� 0�� ���� �̸� distinct�� ����
        distinct.add(temp[0]);
        
        // ���� �ε����� ���ϸ� ���� �ٸ� ��쿡�� distinct�� ����
        for(int i = 1; i < temp.length; i++) {
            if (temp[i-1] != temp[i])
                distinct.add(temp[i]);
        }
        
        // �ߺ� ������ ���� ����� answer�� ����
        int[] answer = new int[distinct.size()];
        idx = 0;
        
        for(int i : distinct) {
            answer[idx++] = i;
        }
        
        return answer;
    }
}