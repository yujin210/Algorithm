package programmers;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int mod = 0;
        ArrayList<Integer> arrlist = new ArrayList<>();
        
        while(n != 0) {
            mod = n%10;
            arrlist.add(mod);
            n /= 10;
        }
        
        for(int i : arrlist) {
            answer += i;
        }

        return answer;
    }
}