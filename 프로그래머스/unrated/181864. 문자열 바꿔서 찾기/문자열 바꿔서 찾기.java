class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        pat = pat.replaceAll("A", "a");
        pat = pat.replaceAll("B", "A");
        pat = pat.replaceAll("a", "B");
        if(myString.contains(pat)) answer = 1;
        
        return answer;
    }
}