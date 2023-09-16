class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int one = 0;
        int two = 0;
        
        for(int i=0; i<num_list.length; i++) {
            if(i%2==0) one += num_list[i];
            else two += num_list[i];
        }
        
        return (one>two)? one : two;
    }
}