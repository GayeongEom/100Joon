class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int un = 0;
        
        for(boolean b : finished) {
            if(!b) un++; 
        }
        
        answer = new String[un];
        int idx= 0;
        
        for(int i=0; i<finished.length; i++) {
            if(!finished[i]) answer[idx++] = todo_list[i];
        }
        
        return answer;
    }
}