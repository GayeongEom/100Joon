class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int[] S = new int[numbers.length+1];
        S[0] = 0;
        
        for(int i=0; i<numbers.length; i++) {
            S[i+1] = S[i] + numbers[i];
            if(S[i]>n)  {
                answer = S[i];
                break;
            }
        }
        if(answer == 0) {
            answer = S[numbers.length];
        }
        
        
        return answer;
    }
}