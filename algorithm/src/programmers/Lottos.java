package programmers;

import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int same = 0;
        int zero = 0;
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        // 같은 숫자의 갯수와 0의 갯수 파악
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(win_nums[i] == lottos[j])
                    same++;
            }
            
            if (lottos[i] == 0)
                zero++;
        }
             
        // 최고 순위
        switch(same+zero) {
            case 6 :
                answer[0] = 1;
                break;
            case 5 : 
                answer[0] = 2;
                break;
            case 4 :
                answer[0] = 3;
                break;
            case 3 :
                answer[0] = 4;
                break;
            case 2 :
                answer[0] = 5;
                break;
            default : 
                answer[0] = 6;
        }
        
        // 최저 순위
        switch(same) {
            case 6 :
                answer[1] = 1;
                break;
            case 5 : 
                answer[1] = 2;
                break;
            case 4 :
                answer[1] = 3;
                break;
            case 3 : 
                answer[1] = 4;
                break;
            case 2 :
                answer[1] = 5;
                break;
            default : 
                answer[1] = 6;
        }
        
        return answer;
    }
}