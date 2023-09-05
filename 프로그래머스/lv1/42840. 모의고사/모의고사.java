import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] user1 = {1,2,3,4,5};
        int[] user2 = {2,1,2,3,2,4,2,5};
        int[] user3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = {0,0,0};
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i]==user1[i%user1.length]) cnt[0]++;
            if(answers[i]==user2[i%user2.length]) cnt[1]++;
            if(answers[i]==user3[i%user3.length]) cnt[2]++;
        }
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        ArrayList<Integer> arr = new ArrayList<>();
        if(cnt[0]==max) arr.add(1);
        if(cnt[1]==max) arr.add(2);
        if(cnt[2]==max) arr.add(3);
        answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arr.get(i);
        }
        
        
        return answer;
    }
}