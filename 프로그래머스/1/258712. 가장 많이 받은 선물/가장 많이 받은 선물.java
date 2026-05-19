import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(friends[i], i);
        }
        
        int[][] giftCount = new int[n][n];
        int[] giftScore = new int[n];
        
        for (int i = 0; i < gifts.length; i++) {
            String[] parts = gifts[i].split(" ");
            
            int giver = map.get(parts[0]);
            int receiver = map.get(parts[1]);
            
            giftCount[giver][receiver]++;
            giftScore[giver]++;
            giftScore[receiver]--;
        }
        
        int[] next = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (giftCount[i][j] > giftCount[j][i]) {
                    next[i]++;
                } else if (giftCount[i][j] < giftCount[j][i]) {
                    next[j]++;
                } else {
                    if (giftScore[i] > giftScore[j]) next[i]++;
                    else if (giftScore[i] < giftScore[j]) next[j]++;
                }
            }
        }
        
        int answer = 0;
        for (int count: next) {
            if (count > answer) answer = count;
        }
        
        return answer;
    }
}