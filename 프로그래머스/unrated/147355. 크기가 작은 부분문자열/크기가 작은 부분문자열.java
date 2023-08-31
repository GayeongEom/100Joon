class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int length = p.length();
        long longP = Long.parseLong(p);
        
        for(int i=0; i<t.length()-length+1; i++) {
            String sub = t.substring(i, i+length);
            if(Long.parseLong(sub) <= longP) answer++;
        }
        
        return answer;
    }
}