import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length; //높이
        int w = park[0].length(); //너비
        int x = 0; int y = 0;
        boolean[][] arr = new boolean[h][w];
        
        // 위아래좌우
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};
        
        for (int i = 0; i < h; i++) {
            String[] p = park[i].split("");
            for (int j = 0; j < w; j++) {
                if (p[j].equals("S")) {
                    y = i;
                    x = j;
                }
                else if (p[j].equals("X")) arr[i][j] = true;
            }
        }
        
        for (String route: routes) {
            String[] r = route.split(" ");
            int count = Integer.parseInt(r[1]);
            
            switch(r[0]) {
                case "E":
                    if (canMove(arr, count, dx[3], dy[3], x, y, h, w)) {
                        x += count;
                    }
                    break;
                case "W":
                    if (canMove(arr, count, dx[2], dy[2], x, y, h, w)) {
                        x -= count;
                    }
                    break;
                case "S":
                    if (canMove(arr, count, dx[1], dy[1], x, y, h, w)) {
                        y += count;
                    }
                    break;
                case "N":
                    if (canMove(arr, count, dx[0], dy[0], x, y, h, w)) {
                        y -= count;
                    }
                    break;
            }
        }
        
        return new int[] {y, x};
    }
    
    private boolean canMove(boolean[][] arr, int count, int dx, int dy, int x, int y, int h, int w) {
        boolean b = true;
        
        for (int i = 0; i < count; i++) {
            if (x + dx < w && x + dx >= 0 && y + dy < h && y + dy >= 0) {
                x += dx;
                y += dy;
                if (arr[y][x]) {
                    b = false;
                    break;
                }
            } else b = false;
        }
        
        return b;
    }
}