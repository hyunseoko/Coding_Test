import java.util.*;

class Solution {
    public int solution(String dirs) {
        int x = 0, y = 0;
        Set<String> seen = new HashSet<>(); 

        for (char c : dirs.toCharArray()) {
            int nx = x, ny = y;

            switch (c) {
                case 'L' -> nx = x - 1;
                case 'R' -> nx = x + 1;
                case 'D' -> ny = y - 1;
                case 'U' -> ny = y + 1;
                default -> { continue; }
            }

            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) continue;

            int ax = Math.min(x, nx), bx = Math.max(x, nx);
            int ay = Math.min(y, ny), by = Math.max(y, ny);
            String edge = ax + "," + ay + ":" + bx + "," + by;

            seen.add(edge); 
            x = nx; y = ny; 
        }

        return seen.size();
    }
}