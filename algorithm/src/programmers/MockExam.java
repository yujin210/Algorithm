package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] answers) {
        int[] std1 = {1,2,3,4,5};
        int[] std2 = {2,1,2,3,2,4,2,5};
        int[] std3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] count = new int[3]; // �� �л����� ���� ���� üũ��
        
        // �� �л����� ��� ä�� �� count�� ���� ����
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == std1[i%std1.length])
                count[0]++;
            
            if(answers[i] == std2[i%std2.length])
                count[1]++;
            
            if((answers[i] == std3[i%std3.length]))
                count[2]++;
        }
        
        
        if(count[0] == count[1] && count[1] == count[2]) { // ��� �л��� ���� ���� ������ ���
            int[] answer = {1,2,3};
            return answer;
        } else {
            // �ִ� �Ǵ�
            int max = count[0];
            if(count[1] > max)
                max = count[1];
            if(count[2] > max)
                max = count[2];
            
            ArrayList<Integer> arrlist = new ArrayList<>();
            
            // �ִ񰪰� ������ ������ ���� �л� arrlist�� �߰�
            for(int i = 0; i < count.length; i++) {
                if(max == count[i])
                    arrlist.add(i+1); // �л��� ��ȣ�� �߰��ϱ� ���� �ε����� +1�� �����.
            }
            
            // �迭 Ÿ������ ��ȯ �� �������� ������ �ϱ� ���� ArrayList�� �迭�� ����ش�.
            int[] answer = new int[arrlist.size()];
            int idx = 0;
            
            for(int i : arrlist) {
                answer[idx++] = i;
            }
            
            // �������� ����
            Arrays.sort(answer);
            
            return answer;
        }
    }
}
