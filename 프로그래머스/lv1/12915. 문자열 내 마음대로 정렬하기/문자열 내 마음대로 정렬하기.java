import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int idx = 0;
        
        Arrays.sort(strings);
        
        for(int i=97; i<123; i++) {
            for(String s : strings) {
                if(s.charAt(n) == (char)i) {
                    answer[idx++] = s;
                }
            }
        }
        
        return answer;
    }
}