import java.lang.Math;

class Solution {
    int solution(int[][] land) {
        int n = land.length;
        
        for (int i=1; i<n; i++) {
            int a = land[i-1][0], b = land[i-1][1];
            int c = land[i-1][2], d = land[i-1][3];
            
            land[i][0] += Math.max(Math.max(b, c), d);
            land[i][1] += Math.max(Math.max(a, c), d);
            land[i][2] += Math.max(Math.max(a, b), d);
            land[i][3] += Math.max(Math.max(a, b), c);
        }
        
        return Math.max(Math.max(land[n-1][0], land[n-1][1]), Math.max(land[n-1][2], land[n-1][3]));
    }
}