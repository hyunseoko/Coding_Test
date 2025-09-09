import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        boolean[] used = new boolean[reserve.length];
        for (int i=0; i<lost.length; i++) {
            for (int j=0; j<reserve.length; j++) {
                if (!used[j] && lost[i] == reserve[j]) {
                    answer++;
                    used[j] = true;
                    lost[i] = -1;
                    break;
                }
            }
        }
        
        for (int i=0; i<lost.length; i++) {
            if (lost[i] == -1) continue;
            
            for (int j=0; j<reserve.length; j++) {
                if (!used[j] && (reserve[j] == lost[i] - 1 
                                 || reserve[j] == lost[i] + 1)) {
                    answer++;
                    used[j] = true;
                    break;
                }
            }
        }
        
        return answer;
    }
}