package programmers;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0; // 약수의 개수 확인용
      
        for(int i = left; i <= right; i++) {
            for(int j = 1; j <= i; j++) {
                if(i%j == 0)    // 약수 발견시
                    count++;    // count 증가
            }

            // 수 1개에 대하여 약수 구하기가 끝나면
            if(count % 2 == 0)
                answer += i;
            else 
                answer -= i;
            
            count = 0;
        }
        return answer;
    }
}