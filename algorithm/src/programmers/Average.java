package programmers;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        double avg = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        avg = sum/arr.length;
        answer = avg;
        return answer;
    }
}