class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char c : myString.toCharArray()) {
            answer += (c<108) ? "l" : c;
        }
        
        return answer;
    }
}