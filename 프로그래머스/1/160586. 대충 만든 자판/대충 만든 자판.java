import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for (String k : keymap) {
            for (int i = 0; i < k.length(); i++) {
                char c = k.charAt(i);
                int press = i + 1;
                map.merge(c, press, Math::min);
            }
        }
        
        for (int idx = 0; idx < targets.length; idx++) {
            String t = targets[idx];
            int sum = 0;
            boolean ok = true;
            
            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);
                Integer press = map.get(c);
                if (press == null) {
                    ok = false;
                    break;
                }
                sum += press;
            }
            answer[idx] = ok ? sum : -1;
        }
        
        return answer;
    }
}