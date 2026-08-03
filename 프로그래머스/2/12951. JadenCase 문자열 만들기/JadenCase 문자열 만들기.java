class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (i == 0 && !Character.isDigit(c)) c = Character.toUpperCase(c);
            else if (i > 0) {
                char c2 = s.charAt(i - 1);
                if (!Character.isDigit(c2) && !Character.isUpperCase(c2) && 
                    !Character.isLowerCase(c2)) c = Character.toUpperCase(c);
                else c = Character.toLowerCase(c);
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}