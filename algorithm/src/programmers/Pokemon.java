package programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        int count = nums.length / 2;
        Arrays.sort(nums);
        
        for(int i = 1; i < nums.length; i++) {
            if (answer < count) {
                if(nums[i] != nums[i-1])
                    answer++;
            }
        }
        return answer;
    }
}