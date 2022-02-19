package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] answers) {
        int[] std1 = {1,2,3,4,5};
        int[] std2 = {2,1,2,3,2,4,2,5};
        int[] std3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] count = new int[3]; // 각 학생마다 정답 개수 체크용
        
        // 각 학생별로 답안 채점 후 count에 개수 적용
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == std1[i%std1.length])
                count[0]++;
            
            if(answers[i] == std2[i%std2.length])
                count[1]++;
            
            if((answers[i] == std3[i%std3.length]))
                count[2]++;
        }
        
        
        if(count[0] == count[1] && count[1] == count[2]) { // 모든 학생의 정답 수가 동일한 경우
            int[] answer = {1,2,3};
            return answer;
        } else {
            // 최댓값 판단
            int max = count[0];
            if(count[1] > max)
                max = count[1];
            if(count[2] > max)
                max = count[2];
            
            ArrayList<Integer> arrlist = new ArrayList<>();
            
            // 최댓값과 동일한 개수를 맞춘 학생 arrlist에 추가
            for(int i = 0; i < count.length; i++) {
                if(max == count[i])
                    arrlist.add(i+1); // 학생의 번호를 추가하기 위해 인덱스에 +1을 해줬다.
            }
            
            // 배열 타입으로 반환 및 오름차순 정렬을 하기 위해 ArrayList를 배열에 담아준다.
            int[] answer = new int[arrlist.size()];
            int idx = 0;
            
            for(int i : arrlist) {
                answer[idx++] = i;
            }
            
            // 오름차순 정렬
            Arrays.sort(answer);
            
            return answer;
        }
    }
}
