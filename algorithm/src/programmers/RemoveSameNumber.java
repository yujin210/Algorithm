package programmers;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> arrlist = new ArrayList<>();
        
        arrlist.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1])
                arrlist.add(arr[i]);
        }

        int[] answer = new int[arrlist.size()];
        int idx = 0;
        for(int i : arrlist) {
            answer[idx++] = i;
        }

        return answer;
    }
}