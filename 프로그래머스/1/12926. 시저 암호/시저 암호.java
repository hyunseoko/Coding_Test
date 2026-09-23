import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
            } else if (Character.isLowerCase(c)) {
                char ch = (char) ((c - 'a' + n) % 26 + 'a');
                sb.append(ch);
            } else if (Character.isUpperCase(c)) {
                char ch = (char) ((c - 'A' + n) % 26 + 'A');
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}