class Solution {
    public int solution(String s) {
        String[] arp = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<10; i++) {
            if(s.contains(arp[i])) {
                s = s.replace(arp[i], Integer.toString(i));
            }
        }
        
        return Integer.parseInt(s);
    }
}