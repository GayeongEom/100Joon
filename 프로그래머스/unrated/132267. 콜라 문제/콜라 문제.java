class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true) {
            if(n<a) break;
            
            answer += b*(n/a);
            n = b*(n/a) + n%a;
        }
        
        return answer;
    }
}