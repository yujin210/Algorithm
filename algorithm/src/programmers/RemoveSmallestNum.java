package programmers;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {	// �迭�� ���ڰ� 1���� �ִ� ���
            int[] answer = {-1};	// �ּڰ� �����ϸ� �ƹ��͵� �����Ƿ� answer�� -1 ��Ƽ� ����
            return answer;
        } else {
            ArrayList<Integer> arrlist = new ArrayList<>();
            
            int min = arr[0]; 
            
            // �ּڰ� ã��
            for(int i = 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            
            // �ּڰ��� �������� ���� ���� �߰� (�ּڰ��� ���� ���� ��� ��� �����ϱ� ����)
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] != min) {
                    arrlist.add(arr[j]);
                }
            }
   
            // ArrayList�� �ִ� �� answer�� ���
            int[] answer = new int[arrlist.size()];
            int idx = 0;
            for(int i : arrlist) {
                answer[idx++] = i;
            }
            
            return answer;
        }
    }
}