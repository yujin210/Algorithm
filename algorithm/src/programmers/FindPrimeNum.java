package programmers;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n == 2)
            answer = 1;
        else {
            answer++; // 2는 소수이므로 값 1 증가 
            for(int i = 3; i <= n; i++) {
                if(find(i) == 1)
                  answer++;
            }
        }
        
        
        return answer;
    }
    
    static int find(int num) {
        int result = 0;
        
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i == 0) {
                result = -1;
                break;
            }
        }    

        if(result != -1)
            result = 1;
        
        
        return result;
    }
}