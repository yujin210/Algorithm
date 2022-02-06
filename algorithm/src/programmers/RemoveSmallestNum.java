package programmers;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {	// 배열에 숫자가 1개만 있는 경우
            int[] answer = {-1};	// 최솟값 제거하면 아무것도 없으므로 answer에 -1 담아서 리턴
            return answer;
        } else {
            ArrayList<Integer> arrlist = new ArrayList<>();
            
            int min = arr[0]; 
            
            // 최솟값 찾기
            for(int i = 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            
            // 최솟값과 동일하지 않은 수만 추가 (최솟값이 여러 개일 경우 모두 제거하기 위함)
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] != min) {
                    arrlist.add(arr[j]);
                }
            }
   
            // ArrayList에 있는 값 answer에 담기
            int[] answer = new int[arrlist.size()];
            int idx = 0;
            for(int i : arrlist) {
                answer[idx++] = i;
            }
            
            return answer;
        }
    }
}