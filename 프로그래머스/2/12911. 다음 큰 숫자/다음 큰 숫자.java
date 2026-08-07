import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);
        
        while (true) {
            int count2 = Integer.bitCount(++n);
            if (count == count2) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}