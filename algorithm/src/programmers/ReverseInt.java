package programmers;

import java.util.ArrayList;

class Solution {
    public long[] solution(long n) {
        ArrayList<Long> arrlist = new ArrayList<>();
        long mod = 0;
        
        while(n > 0) {
            mod = n%10;
            arrlist.add(mod);
            n /= 10;
        }
        
        int idx = 0;
        
        long[] answer = new long[arrlist.size()];
        
        for(long i : arrlist) {
            answer[idx++] = i;
        }
        
        return answer;
    }
}