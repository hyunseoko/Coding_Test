import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int s : scoville) pq.add((long)s);

        if (!pq.isEmpty() && pq.peek() >= K) return 0;

        int mixes = 0;
        while (pq.size() >= 2 && pq.peek() < K) {
            long a = pq.poll();
            long b = pq.poll();
            long mixed = a + 2L * b;
            pq.add(mixed);
            mixes++;
        }
        
        int answer = (pq.peek() != null && pq.peek() >= K) ? mixes : -1;

        return answer;
    }
}