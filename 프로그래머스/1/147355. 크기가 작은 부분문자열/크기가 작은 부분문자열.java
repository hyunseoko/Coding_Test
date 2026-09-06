class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        
        for (int i = 0; i < t.length() - p.length() + 1; i ++) {
            String s = t.substring(i, i + p.length());
            long tNum = Long.parseLong(s);
            if (tNum <= pNum) answer++;
        }
        
        return answer;
    }
}