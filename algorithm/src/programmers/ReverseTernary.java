package programmers;

import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> arrlist = new ArrayList<>();
        
        while(n != 0) {
            arrlist.add(n%3);
            n /= 3;
        }
        
        int idx = 0;
        
        for(int i = arrlist.size()-1; i >= 0; i--) {
            answer += ((int) Math.pow(3, i)*arrlist.get(idx++));
        }
        
        return answer;
    }
}