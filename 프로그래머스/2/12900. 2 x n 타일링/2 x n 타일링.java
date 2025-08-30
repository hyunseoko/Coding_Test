class Solution {
    static final int MOD = 1000000007;
    
    public int solution(int n) {
        long a = 1;
        long b = 1;
        
        for (int i=0; i<n-1; i++){
            long sum = (a+b)%MOD;
            a = b;
            b = sum;
        }
        
        return (int)b;
    }
}