class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = numer1 * denom2 + numer2 * denom1;
        int deno = denom1 * denom2;
        
        int g = gcd(num, deno);
        num /= g;
        deno /= g;
        
        return new int[]{num, deno};
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}