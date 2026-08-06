import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        
        while (!s.equals("1")) {
            for (char ch : s.toCharArray()) {
                if (ch == '1') count++;
            }
            answer[0]++;
            answer[1] += (s.length() - count);
            
            s = Integer.toBinaryString(count);
            
            count = 0;
        }
        
        return answer;
    }
}