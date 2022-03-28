package programmers;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] upper = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] lower = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int idx = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char caesar = s.charAt(i);
            if(caesar >= 65 && caesar <= 90) {
                idx = caesar%65;
                idx += n;
                if(idx > 25) {
                    idx %= 26;
                } 
                answer += upper[idx];
            } else if(caesar >= 97 && caesar <= 122) {
                idx = caesar%97;
                idx += n;
                if(idx > 25) {
                    idx %= 26;
                }
                answer += lower[idx];
            } else {
                answer += caesar;
            }         
        }
       
        return answer;
    }
}