import java.util.*;

class Solution {
    
    public int gcd(int n, int m) {
        if(m==0) return n;
        return gcd(m, n%m);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        answer[0] = gcd(max, min);
        answer[1] = n*m/answer[0];
        
        return answer;
    }
}