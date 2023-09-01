import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        
        for(int[] tmp : commands) {
            int[] arr = Arrays.copyOfRange(array, tmp[0]-1, tmp[1]);
            Arrays.sort(arr);
            answer[idx++] = arr[tmp[2]-1];
            
        }
        
        
        return answer;
    }
}