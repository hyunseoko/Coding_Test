import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int maxPro = priorities[0];
        Queue<int[]> queue = new LinkedList<>();
        for (int i=0; i<priorities.length; i++){
            queue.add(new int[]{priorities[i], i});
            if (maxPro < priorities[i]) maxPro = priorities[i];
        }
        while (true){
            int[] current = queue.poll();
            if (maxPro == current[0]){
                maxPro = 0;
                for (int[] q : queue){
                    if (q[0] > maxPro) maxPro = q[0];
                }
                answer++;
                if (location == current[1]) {
                    break;
                }
            }
            else {
                queue.add(current);
            }
        }
        
        return answer;
    }
}