class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int sub = 1;
        
        for(int i : num_list) {
            sum += i;
            sub *= i;
        }
        
        
        return (sub<Math.pow(sum,2))?1:0;
    }
}