import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        int n = players.length;
        String temp = "";
        
        for(int i = 0; i < n; i++) {
            map.put(players[i], i);
        }
        
        for (String call: callings) {
            int idx = map.get(call);
            temp = players[idx];
            players[idx] = players[idx - 1];
            players[idx - 1] = temp;
            
            map.put(call, idx - 1);
            map.put(players[idx], idx);
        }
        
        return players;
    }
}