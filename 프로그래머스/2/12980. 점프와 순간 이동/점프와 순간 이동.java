public class Solution {
    public int solution(int n) {
        int i = n % 2 == 0 ? 0 : 1;
        int count = n - i;
        
        while (count > 1) {
            if (count % 2 == 1) {
                count = (count - 1) / 2;
                i++;
            } else count /= 2;
        }
        
        return count + i;
    }
}