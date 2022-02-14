package programmers;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 문자열의 각 인덱스 추출해서 저장할 배열
        char[] ch = new char[s.length()];
        
        // 문자열에서 각 인덱스 추출 후 문자형 배열에 저장
        for(int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        
        // 배열 정렬
        Arrays.sort(ch);
        
        // 정렬한 배열을 역순으로 이어붙여주기 (문자열 내림차순 정렬)
        for(int i = ch.length-1; i >= 0; i--) {
            answer += ch[i];
        }
        
        return answer;
    }
}