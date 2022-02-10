package programmers;

import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrlist = new ArrayList<>();  // 두 개의 수 더해서 나올 수 있는 모든 수 저장 (중복 허용)
        ArrayList<Integer> distinct = new ArrayList<>(); // arrlist에서 중복 제거 후 저장

        // 두 개의 수 더해서 나올 수 있는 모든 수 arrlist에 저장
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                    arrlist.add(numbers[i] + numbers[j]);
            }
        }
        
        // 임시 배열 temp에 arrlist 옮김
        int[] temp = new int[arrlist.size()];
        int idx = 0;
        
        for(int i : arrlist) {
            temp[idx++] = i;
        }
        
        // 중복 제거 시 앞의 값과 비교 & answer에 오름차순으로 담기 위해 정렬
        Arrays.sort(temp);
        
        // 배열 temp에서 인덱스 0번 값을 미리 distinct에 저장
        distinct.add(temp[0]);
        
        // 앞의 인덱스와 비교하며 값이 다른 경우에만 distinct에 저장
        for(int i = 1; i < temp.length; i++) {
            if (temp[i-1] != temp[i])
                distinct.add(temp[i]);
        }
        
        // 중복 제거한 최종 결과를 answer에 저장
        int[] answer = new int[distinct.size()];
        idx = 0;
        
        for(int i : distinct) {
            answer[idx++] = i;
        }
        
        return answer;
    }
}