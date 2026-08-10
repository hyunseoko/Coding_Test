class Solution {
    public int[] solution(int brown, int yellow) {
        int x = 0;
        int y = 0;
        long sum = brown + yellow;
        
        // brown = 2(x + y - 2)
        
        for (int i = 1; i < brown / 2; i++) {
            for (int j = i; j < brown / 2; j++) {
                if (i + j - 2 == brown / 2) {
                    if (i * j == sum) {
                        x = j;
                        y = i;
                    }
                }
            }
        }
        
        return new int[] {x, y};
    }
}