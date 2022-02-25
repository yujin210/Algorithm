package programmers;

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        char[] ch = new char[strings.length];
        List<String> list = new ArrayList<>();
        
        // 주어진 문자열들 정렬
        Arrays.sort(strings);
        
        // 사전순으로 정렬하여 List에 저장
        for(String s : strings) {
            list.add(s);
        }
        
        
        // 문자열에서 인덱스 추출
        for(int i = 0; i < strings.length; i++) {
            ch[i] = strings[i].charAt(n);
        }
        
        // 인덱스 다시 정렬
        Arrays.sort(ch);
        
        
        int idx = 0;

      
        for(int i = 0; i < strings.length; i++) {
            for(int j = 0; j < list.size(); j++) {
               
                if(ch[i] == list.get(j).charAt(n)) {
                    answer[i] = list.get(j);
                    list.remove(j);
                    break;
                }
            }
         }
    
        return answer;
    }
}