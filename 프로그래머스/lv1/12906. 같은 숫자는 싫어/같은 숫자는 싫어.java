import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> al = new ArrayList<>();
        int num = -1;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=num) {
                al.add(arr[i]);
                num = arr[i];
            }
        }
        
        answer = new int[al.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = al.get(i);
        }

        return answer;
    }
}