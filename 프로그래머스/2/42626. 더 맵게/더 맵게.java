import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for (int s: scoville) pq.add(s);

         int cnt = 0;
         while (pq.size() > 1 && pq.peek() < K) {
             pq.add(pq.remove() + pq.remove() * 2);
             cnt++;
         }

         return pq.peek() >= K ? cnt : -1;
    }
}