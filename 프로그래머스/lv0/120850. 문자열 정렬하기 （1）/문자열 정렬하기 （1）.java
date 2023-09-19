import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        my_string = my_string.replaceAll("[^0-9]", "");
        answer = new int[my_string.length()];
        String[] arr = my_string.split("");
        Arrays.sort(arr);
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}