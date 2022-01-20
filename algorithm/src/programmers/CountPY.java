package programmers;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0; // p�� y�� ������ ���� ������ ���� �޸�, ������ �ϳ��� ���
        // ���� Ÿ�� ���� ch �̻��
        
        s = s.toUpperCase(); // ���ڿ� s�� ��� �빮�ڷ� �ٲ㼭 �ҹ��ڿ� �빮�� ������ �ʿ������ ��
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'P') {
                count++; // p�� ã���� count ����
            } else if(s.charAt(i) == 'Y') {
                count--; // y�� ã���� count ����
            }
        }
        
        answer = (count == 0); // count�� 0�̸� p�� y�� ������ �����ϰų�, �ϳ��� ���� ����̹Ƿ� true ��ȯ 
        return answer;
    }
}