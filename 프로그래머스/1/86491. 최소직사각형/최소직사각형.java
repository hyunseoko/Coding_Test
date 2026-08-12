class Solution {
    public int solution(int[][] sizes) {
        int tmp = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        int x = sizes[0][0];
        int y = sizes[0][1];
        
        for (int i = 0; i < sizes.length; i++) {
            if (x < sizes[i][0]) x = sizes[i][0];
            if (y < sizes[i][1]) y = sizes[i][1];
        }
        
        return x * y;
    }
}