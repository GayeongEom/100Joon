class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String first = "" + a + b;
        String two = "" + b + a;
        
        answer = (Integer.parseInt(first)>Integer.parseInt(two))? Integer.parseInt(first) : Integer.parseInt(two);
        
        return answer;
    }
}