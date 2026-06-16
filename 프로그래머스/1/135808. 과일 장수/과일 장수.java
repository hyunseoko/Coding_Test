import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int n = score.length;
        int box = n / m;
        Arrays.sort(score);
        
        for (int i = 0; i < box; i++) {
            n -= m;
            answer += (score[n] * m);
        }
        
        return answer;
    }
}