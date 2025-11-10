import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        boolean answer = true;
        
        for (char c : s.toCharArray()) {
            if (c == ')' && st.empty()) {
                answer = false;
                break;
            }
            else if (c == ')' && st.size() > 0) st.pop();
            else if (c == '(') st.push(c);
        }
        
        if (answer == true) answer = st.empty() ? true : false;
        
        return answer;
    }
}