package programmers;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0; // p�� y�� ������ ���� ������ ���� �޸�, ������ �ϳ��� ���
        char ch; 
        
        s = s.toUpperCase(); // ���ڿ� s�� ��� �빮�ڷ� �ٲ㼭 �ҹ��ڿ� �빮�� ������ �ʿ������ ��
        
        for(int i = 0; i < s.length(); i++) {
             ch = s.charAt(i);
            if(ch == 'P') {
                count++; // p�� ã���� count ����
            } else if(ch == 'Y') {
                count--; // y�� ã���� count ����
            }
        }
        
        answer = (count == 0); // count�� 0�̸� p�� y�� ������ �����ϰų�, �ϳ��� ���� ����̹Ƿ� true ��ȯ 
        return answer;
    }
}