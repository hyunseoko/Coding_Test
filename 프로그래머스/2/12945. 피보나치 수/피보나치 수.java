class Solution {
    public int solution(int n) {
        int answer = 0;
        int ppre = 0;
        int pre = 1;
        
        for (int i = 2; i <= n; i++) {
            if (i == 2) {
                answer = ppre + pre;
            } else {
                ppre = pre;
                pre = answer;
                answer = (ppre + pre) % 1234567;
            }
        }
        
        return answer % 1234567;
    }
}