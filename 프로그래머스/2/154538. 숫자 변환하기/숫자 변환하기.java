import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) return 0;
        if (x > y) return -1;
        
        int[] dist = new int[y + 1];
        Queue<Integer> q = new ArrayDeque<>();
        
        Arrays.fill(dist, -1);
        q.add(x);
        dist[x] = 0;
        
        while(!q.isEmpty()) {
            int cur = q.poll();
            int d = dist[cur];
            
            int a = cur + n;
            int b = cur * 2;
            int c = cur * 3;
            
            if (a <= y && dist[a] == -1) {
                dist[a] = d + 1;
                if (a == y) return dist[a];
                q.add(a);
            }
            if (b <= y && dist[b] == -1) {
                dist[b] = d + 1;
                if (b == y) return dist[b];
                q.add(b);
            }
            if (c <= y && dist[c] == -1) {
                dist[c] = d + 1;
                if (c == y) return dist[c];
                q.add(c);
            }
        }
        
        return -1;
    }
}