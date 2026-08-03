class Solution {
    public boolean solution(int x) {
        int n = x;
        int y = 0;
        
        while (n != 0) {
            y += (n % 10);
            n /= 10;
        }
        
        return x % y == 0 ? true : false;
    }
}