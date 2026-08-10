class Solution {
    public int[] solution(int brown, int yellow) {
        long sum = brown + yellow;
                
        for (int i = 1; i < brown / 2; i++) {
            for (int j = i; j < brown / 2; j++) {
                if (i + j - 2 == brown / 2 && i * j == sum) {
                    return new int[] {j, i};
                }
            }
        }
        
        return null;
    }
}