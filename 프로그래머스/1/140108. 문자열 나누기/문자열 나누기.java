class Solution {
    public int solution(String s) {
        int answer = 0;
        int cntX = 0, cnt = 0;
        char x = s.charAt(0);
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
                
            if (x == c) cntX++;
            else cnt++;
            
            if (cnt == cntX) {
                answer++;
                cntX = 0;
                cnt = 0;
                if (i+1 < s.length()) {
                    x = s.charAt(i+1);
                }
            }
        } 
        
        if (cnt != cntX) answer++;
        
        return answer;
    }
}