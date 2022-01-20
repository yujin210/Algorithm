package programmers;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        char ch;
        
        for(int i = 0; i < s.length(); i++) {
             ch = s.charAt(i);
            if(ch == 'p' || ch == 'P') {
                pCount++;
            } else if(ch == 'y' || ch == 'Y') {
                yCount++;
            }
        }
        
        answer = (pCount == yCount);
        return answer;
    }
}