class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    for(int l=2; l<sum+1; l++) {
                        if(sum%l==0 && l!=sum) break;
                        else if(l==sum) answer++;
                    }
                    
                }
            }
        }

        return answer;
    }
}