import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0; i<names.length; i += 5) {
            arr.add(names[i]);
        }
        
        answer = new String[arr.size()];
        int idx = 0;
        
        for(int i=0; i<arr.size(); i++) {
            answer[idx++] = arr.get(i);
        }
        
        
        return answer;
    }
}