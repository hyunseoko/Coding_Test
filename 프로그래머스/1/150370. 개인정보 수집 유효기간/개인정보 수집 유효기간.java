import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        String[] tod_arr = today.split("\\.");
        int t_days = (Integer.parseInt(tod_arr[0]) * 12 * 28) +
            (Integer.parseInt(tod_arr[1]) * 28) +
            Integer.parseInt(tod_arr[2]);
        
        for (String term: terms) {
            String[] t = term.split(" ");
            map.put(t[0], Integer.parseInt(t[1]));
        }
                
        for (int i = 0; i < privacies.length; i++) {
            String[] priv = privacies[i].split(" ");
            String[] priv_s = priv[0].split("\\.");
            
            int p_days = (Integer.parseInt(priv_s[0]) * 12 * 28) +
            (Integer.parseInt(priv_s[1]) * 28) +
            Integer.parseInt(priv_s[2]);
            
            int p_term = map.get(priv[1]);
            
            if (p_term * 28 <= t_days - p_days) {
                list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}