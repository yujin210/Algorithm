package programmers;

class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        answer = answer.toLowerCase();                      // 1단계
        answer = answer.replaceAll("[^a-z0-9-_.]", "");     // 2단계
        answer = answer.replaceAll("[.]{2,}", ".");         // 3단계
        answer = answer.replaceAll("^[.]|[.]$", "");        // 4단계
        
        if(answer.length() == 0) {                          // 5단계
            answer += "a";
        }
        
        if(answer.length() >= 16) {                         // 6단계 
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }
        
        if(answer.length() <= 2) {                          // 7단계
            String temp = answer.substring(answer.length()-1);
            while(answer.length() != 3) {
                answer += temp;
            }
        }
        
        return answer;
    }
}