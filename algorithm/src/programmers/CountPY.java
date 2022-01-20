package programmers;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0; // p와 y의 개수를 각각 세었던 전과 달리, 변수를 하나만 사용
        // 문자 타입 변수 ch 미사용
        
        s = s.toUpperCase(); // 문자열 s를 모두 대문자로 바꿔서 소문자와 대문자 구분이 필요없도록 함
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'P') {
                count++; // p를 찾으면 count 증가
            } else if(s.charAt(i) == 'Y') {
                count--; // y를 찾으면 count 감소
            }
        }
        
        answer = (count == 0); // count가 0이면 p와 y의 개수가 동일하거나, 하나도 없는 경우이므로 true 반환 
        return answer;
    }
}