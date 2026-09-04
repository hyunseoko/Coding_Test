import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int sum = 0;
        int idx = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }
        
        while (true) {            
            time++;
            int out = queue.poll();
            sum -= out;
            
            if (sum + truck_weights[idx] <= weight) {
                sum += truck_weights[idx];
                queue.offer(truck_weights[idx]);
                idx++;
            } else {
                queue.offer(0);
            }
            
            if (idx == truck_weights.length) {
                time += bridge_length;
                break;
            }
        }
        
        return time;
    }
}