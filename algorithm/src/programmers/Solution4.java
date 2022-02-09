package programmers;

import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if (s.length() == 4 || s.length() == 6) {
            if (Pattern.matches("^[0-9]*$", s) == true)
                answer = true;
            else {
                answer = false;
            }
        }
        return answer;
    }
}