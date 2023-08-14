import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length<2) {
            answer = new int[] {-1};
            return answer;
        }
        
        answer = new int[arr.length-1];
        
        //제일 작은 수의 값 구하기
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        //정답배열에 값 저장하기
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==min) continue;
            answer[idx++] = arr[i];
        }
        
        return answer;
    }
}