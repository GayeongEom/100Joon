class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        //char로 ㅂ꾸고 int로 바꾸면 char는 숫자로 인식
        for(char c : s.toCharArray()) {
            if(c==32) {
                answer += " ";
            } else if(c>='a' && c<='z') {
                c += n;
                if(c>122) c -= 26;
                answer += c;
            } else if(c>='A' && c<='Z') {
                c += n;
                if(c>90) c -=26;
                answer += c;
            }
            
        }
        
        return answer;
    }
}