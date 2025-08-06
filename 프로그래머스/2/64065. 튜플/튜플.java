import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] sets = s.split("\\},\\{"); 
        Arrays.sort(sets, Comparator.comparingInt(String::length));

        List<Integer> answer = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (String set : sets) {
            String[] nums = set.split(",");
            for (String num : nums) {
                int n = Integer.parseInt(num);
                if (!seen.contains(n)) {
                    seen.add(n);
                    answer.add(n);
                }
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}