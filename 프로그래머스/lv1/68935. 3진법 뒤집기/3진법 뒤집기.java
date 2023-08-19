import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String rv = new StringBuilder(new String(Integer.toString(n,3))).reverse().toString();
        
        answer = Integer.parseInt(rv,3);
        
        
        return answer;
    }
}