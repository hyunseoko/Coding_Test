import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();
        int[] answer = new int[2];
        boolean[][] arr = new boolean[h][w];
        
        for (int i = 0; i < h; i++) {
            String[] p = park[i].split("");
            for (int j = 0; j < w; j++) {
                if (p[j].equals("S")) {
                    answer[0] = i;
                    answer[1] = j;
                }
                else if (p[j].equals("X")) arr[i][j] = true;
            }
        }
        
        for (String route : routes) {
            String[] s = route.split(" ");
            int count = Integer.parseInt(s[1]);
            boolean x = true;
            
            switch(s[0]){
                case "E":
                    if (answer[1] + count < w) {
                        for (int i = answer[1]; i <= answer[1] + count; i++) {
                            if (arr[answer[0]][i]) x = false;
                        }
                        if (x) answer[1] += count;
                    }
                    break;
                case "W":
                    if (answer[1] - count >= 0) {
                        for (int i = answer[1]; i >= answer[1] - count; i--) {
                            if (arr[answer[0]][i]) x = false;
                        }
                        if (x) answer[1] -= count;
                    }
                    break;
                case "S":
                    if (answer[0] + count < h) {
                        for (int i = answer[0]; i <= answer[0] + count; i++) {
                            if (arr[i][answer[1]]) x = false;
                        }
                        if (x) answer[0] += count;
                    }
                    break;
                case "N":
                    if (answer[0] - count >= 0) {
                        for (int i = answer[0]; i >= answer[0] - count; i--) {
                            if (arr[i][answer[1]]) x = false;
                        }
                        if (x) answer[0] -= count;
                    }
                    break;
            }
        }
        
        return answer;
    }
}