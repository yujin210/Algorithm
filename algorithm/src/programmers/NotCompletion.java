package programmers;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> list = Arrays.asList(participant);
        ArrayList<String> arrlist = new ArrayList(list);
        
        Collections.sort(arrlist);

        int idx = 0;

        for(int i = 0; i < completion.length; i++) {
            idx = Collections.binarySearch(arrlist, completion[i]);
            if(idx != -1) {
                 arrlist.remove(idx);
            }
        }
        
        for(String name : arrlist) {
            answer = name;
        }
        
        return answer;
    }
}