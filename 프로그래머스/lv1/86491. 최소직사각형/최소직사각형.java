class Solution {
    public int solution(int[][] sizes) {
        int row = 0;
        int col = 0;
        
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0]<sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(sizes[i][0]>row) row = sizes[i][0];
            if(sizes[i][1]>col) col = sizes[i][1];
        }
        
        return row*col;
    }
}