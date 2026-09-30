import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        int idx = 0;
        
        for (int i = 0; i < commands.length; i++) {
            count = commands[i][1] - commands[i][0] + 1;
            int[] arr = new int[count];
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                arr[idx++] = array[j];
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
            idx = 0;
        }
        
        return answer;
    }
}