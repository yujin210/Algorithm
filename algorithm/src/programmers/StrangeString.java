package programmers;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] tokens = s.split(" ", -1);
        
        for(int i = 0; i < tokens.length; i++) {
            for(int j = 0; j < tokens[i].length(); j++) {
                if (j % 2 == 0)
                    answer += tokens[i].substring(j, j+1).toUpperCase();
                else
                    answer += tokens[i].substring(j, j+1).toLowerCase();
            }
            if(i != tokens.length-1)
                answer += " ";
        }
        
        return answer;
    }
}