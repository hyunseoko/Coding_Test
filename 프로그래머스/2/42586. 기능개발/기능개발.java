import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int days = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
            queue.add(days);
        }
        
        int count = 1;
        while (!queue.isEmpty()) {
            int num = queue.poll();
            
            for (int i = 0; i < progresses.length; i++) {
                if (!queue.isEmpty() && queue.peek() <= num) {
                    queue.remove();
                    count++;
                }
                else break;
            }
            list.add(count);
            count = 1;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}