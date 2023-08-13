import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
    	int leng = 0;
    	int idx = 0;
    	
    	//배열의 크기 구하기
    	for(int i : arr) {
    		if(i%divisor==0) {
    			leng++;
    		}
    	}
    	
    	//배열 만들기
    	if(leng==0) {
    		int[] answer = {-1};
    		return answer;
    	}
    	
    	int[] answer = new int[leng];
    	
    	//배열 하나씩 집어넣기
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i]%divisor==0) {
    			answer[idx] = arr[i];
    			idx++;
    		}
    	}
    	Arrays.sort(answer);
    	
        
        return answer;
    }
}
