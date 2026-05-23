import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bag = new Stack<>();
        
        for (int move: moves) {
            int col = move - 1;
            
            for (int row = 0; row < board.length; row++) {
                int doll = board[row][col];
                
                if (doll != 0) {
                    if (!bag.isEmpty() && bag.peek() == doll) {
                        bag.pop();
                        answer += 2;
                    } else {
                        bag.push(doll);
                    }
                    
                    board[row][col] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}