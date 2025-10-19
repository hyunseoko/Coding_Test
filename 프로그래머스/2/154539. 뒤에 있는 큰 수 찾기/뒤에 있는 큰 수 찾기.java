import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) answer[i] = -1;
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++){
            while (!st.isEmpty() && numbers[st.peek()] < numbers[i]){
                answer[st.pop()] = numbers[i];
            }
            st.push(i);
        }
        
        return answer;
    }
}