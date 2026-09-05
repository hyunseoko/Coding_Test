import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> q = new ArrayDeque<>();
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        
        q.offer(new int[]{0, 0});
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (ny < 0 || ny >= maps[0].length || nx < 0 || 
                    nx >= maps.length || (nx == 0 && ny == 0)) continue;
                if (maps[nx][ny] == 1) {
                        maps[nx][ny] = maps[x][y] + 1;
                        q.offer(new int[]{nx, ny});
                }
            }
        }
        
        int result = maps[maps.length - 1][maps[0].length - 1];
        
        return result == 1 ? -1 : result;
    }
}