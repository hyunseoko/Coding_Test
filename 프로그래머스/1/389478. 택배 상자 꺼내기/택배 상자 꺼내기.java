class Solution {
    public int solution(int n, int w, int num) {
        int y1 = (n - 1) / w;
        int x1 = (n - 1) % w;
        if (y1 % 2 != 0) x1 = w - 1 - x1;
        
        int y2 = (num - 1) / w;
        int x2 = (num - 1) % w;
        if (y2 % 2 != 0) x2 = w - 1 - x2;
        
        if (y1 == y2) return 1;
        else if (y1 > y2) {
            if (y1 % 2 == 0) {
                if (x1 < x2) return y1 - y2;
                else return y1 - y2 + 1;
            } else {
                if (x1 > x2) return y1 - y2;
                else return y1 - y2 + 1;
            }
        }
        
        return 0;
    }
}