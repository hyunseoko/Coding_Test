import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new ArrayDeque<>();
        int[] count = new int[10];
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
            count[priorities[i]]++;
        }
        
        int max = 9;
        while (max > 0 && count[max] == 0) max--;
        
        int order = 0;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            
            if (cur[0] < max) queue.offer(cur);
            else {
                order++;
                count[cur[0]]--;
                
                if (cur[1] == location) break;
                
                while (max > 0 && count[max] == 0) max--;
            }
        }
        
        return order;
    }
}