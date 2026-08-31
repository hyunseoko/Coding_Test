class Solution {
    public int[] solution(int n, int m) {
        int max = 1;
        int min = m > n ? m : n;
        
        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) max = i;
            if (min % n != 0 || min % m != 0) min++;
        }
        
        return new int[] {max, min};
    }
}