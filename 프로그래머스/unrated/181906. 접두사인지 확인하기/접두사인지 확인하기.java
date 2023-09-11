class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if(is_prefix.length()>my_string.length()) answer = 0;
        else if(is_prefix.charAt(0)!=my_string.charAt(0)) answer = 0;
        else if(is_prefix.equals(my_string.substring(0,is_prefix.length()))) answer = 1;
        
        
        return answer;
    }
}