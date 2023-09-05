import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        if(score.length<m) return answer;
        for(int i : score) {
            arr.add(i);
        }
        Collections.sort(arr, Collections.reverseOrder());
        int iter = score.length/m;
        int idx = m-1;
        for(int i=0; i<iter; i++) {
            answer += arr.get(idx) * m;
            idx += m;
        }
        
        
        return answer;
    }
}