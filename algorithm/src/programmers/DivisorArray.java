package programmers;

import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> arrlist = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i]%divisor == 0)
                arrlist.add(arr[i]);
        }
        
        if(arrlist.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[arrlist.size()];
            int idx = 0;
            for(int i : arrlist) {
                answer[idx++] = i;
            }
            Arrays.sort(answer);
        }
        return answer;
    }
}