class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (long i = 1; i <= n; i++) {
            if (isPrime(i)) answer++;
        }
        
        return answer;
    }
    
    boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
} 