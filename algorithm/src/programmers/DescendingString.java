package programmers;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // ���ڿ��� �� �ε��� �����ؼ� ������ �迭
        char[] ch = new char[s.length()];
        
        // ���ڿ����� �� �ε��� ���� �� ������ �迭�� ����
        for(int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        
        // �迭 ����
        Arrays.sort(ch);
        
        // ������ �迭�� �������� �̾�ٿ��ֱ� (���ڿ� �������� ����)
        for(int i = ch.length-1; i >= 0; i--) {
            answer += ch[i];
        }
        
        return answer;
    }
}