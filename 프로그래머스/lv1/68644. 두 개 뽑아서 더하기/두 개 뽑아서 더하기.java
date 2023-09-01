import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int sum = 0;
        
        ArrayList<Integer> tmp = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if(!tmp.contains(sum)) tmp.add(sum);
            }
            
        }
        
        answer = new int[tmp.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tmp.get(i);
        }
        
        Arrays.sort(answer);
        
        
        
        return answer;
    }
}