import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : number.toCharArray()) {
            // 앞에서부터 작은 수를 지우는 것이 유리
            while (k>0 && sb.length()>0 && sb.charAt(sb.length()-1)<c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }
        
        // 다 못지운 경우
        if (k>0) sb.setLength(sb.length()-k);
        
        return sb.toString();
    }
}