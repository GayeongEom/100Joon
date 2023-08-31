class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] a1 = new String[n];
        String[] a2 = new String[n];
    
        for(int i=0; i<n; i++) {
            a1[i] = Integer.toString(arr1[i], 2);
            a2[i] = Integer.toString(arr2[i], 2);
            
            if(a1[i].length()<n) a1[i] = "0".repeat(n - a1[i].length()) + a1[i];
            if(a2[i].length()<n) a2[i] = "0".repeat(n - a2[i].length()) + a2[i];
        }    
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(a1[i].charAt(j)=='1' || a2[i].charAt(j)=='1') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
               answer[i] = answer[i].substring(4, answer[i].length());
        }
        
        return answer;
    }
}