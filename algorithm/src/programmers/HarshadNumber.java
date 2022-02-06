package programmers;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x; // 일의 자리를 구할 때 사용하기 위해 x 값을 따로 저장한다.
        int sum = 0;
        
        while(temp != 0) {
            sum += (temp%10);
            temp /= 10;
        }
        
        answer = (x%sum == 0) ? true : false;	// 매개변수로 주어진 x를 사용한다. (temp는 값이 변했으므로 사용불가)
        
        return answer;
    }
}