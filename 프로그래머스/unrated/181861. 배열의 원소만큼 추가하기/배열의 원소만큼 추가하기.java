import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        String str = "";
        
        for(int i : arr) {
            str += (Integer.toString(i) + " ").repeat(i);
        }
        
        String[] tmp = str.split(" ");
        answer = new int[tmp.length];
        
        for(int i=0; i<tmp.length; i++) {
            answer[i] = Integer.parseInt(tmp[i]);
        }
        
        
        
        return answer;
    }
}