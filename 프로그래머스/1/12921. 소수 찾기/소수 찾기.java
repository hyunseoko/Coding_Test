class Solution {
    public int solution(int n) {
        if (n < 2) return 0;
        boolean[] composite = new boolean[n + 1];
        
        for (long i = 2; i * i <= n; i++) {
            if (!composite[(int)i]) {
                for (long j = i * i; j <= n; j += i) {
                    composite[(int)j] = true;
                }
            }
        }
        
        int cnt = 0;
        for (int i = 2; i <= n; i++) if (!composite[i]) cnt++;
        return cnt;
    }
}