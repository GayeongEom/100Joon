class Solution {
    public String solution(String phone_number) {
        String s = phone_number.substring(0, phone_number.length()-4).replaceAll("[0-9]", "*");
        String n = phone_number.substring(phone_number.length()-4, phone_number.length());
        
        return s+n;
    }
}