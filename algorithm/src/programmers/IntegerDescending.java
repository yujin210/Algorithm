package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> arr = new ArrayList<>();

        long mod = 0;
        while(n != 0) {
            mod = n%10;
            arr.add(mod);
            n /= 10;
        }

        long[] array = new long[arr.size()];
        int idx = 0;
        for(long i : arr) {
            array[idx++] = i;
        }

        Arrays.sort(array);

        int mul = 1;
       for(int i = 0; i < array.length; i++) {
           answer += array[i] * mul;
           mul *= 10;
       }

        return answer;
    }
}