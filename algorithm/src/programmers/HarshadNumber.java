package programmers;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x; // ���� �ڸ��� ���� �� ����ϱ� ���� x ���� ���� �����Ѵ�.
        int sum = 0;
        
        while(temp != 0) {
            sum += (temp%10);
            temp /= 10;
        }
        
        answer = (x%sum == 0) ? true : false;	// �Ű������� �־��� x�� ����Ѵ�. (temp�� ���� �������Ƿ� ���Ұ�)
        
        return answer;
    }
}