class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        answer = (n%slice > 0) ? n/slice+1 : n/slice;
        
        return answer;
    }
}