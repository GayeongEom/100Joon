import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> honor = new ArrayList<>();
        
        for(int i=0; i<score.length; i++) {
            honor.add(score[i]);
            Collections.sort(honor);
            
            if(i>=k) {
                honor.remove(0);
            }
            answer[i] = honor.get(0);
        }
        
        
        return answer;
    }
}