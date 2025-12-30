class Solution {
    public long solution(int n) {
        long[] num = new long[n + 1];
        
        num[0] = 1;
        num[1] = 1;
        for (int i = 2; i <= n; i++) {
            num[i] = (num[i - 1] + num[i - 2]) % 1234567;
        }
        
        return num[n];
    }
}