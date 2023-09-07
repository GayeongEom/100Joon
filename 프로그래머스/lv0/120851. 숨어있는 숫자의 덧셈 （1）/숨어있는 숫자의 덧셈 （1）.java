class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String nums = "";
        
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(ch>=48 && ch<=57) nums += ch;
        }
        
        String[] arr = nums.split("");
        for(int i=0; i<arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}