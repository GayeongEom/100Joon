import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++) {
            budget -= d[i];
            if(budget<0) {
                answer = i;
                break;
            } else {
                answer = d.length;
            }
        }
        
        return answer;
    }
}