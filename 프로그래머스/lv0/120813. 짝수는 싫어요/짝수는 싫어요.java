import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
            if(i%2!=0) arr.add(i);
        }
        answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}