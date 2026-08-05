import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int sum1 = 0;
        int sum2 = 0;
        int n = A.length;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < n; i++) {
            sum1 += (A[i] * B[n - 1 - i]);
            sum2 += (A[n - 1 - i] * B[i]);
        }

        return sum1 <= sum2 ? sum1 : sum2;
    }
}