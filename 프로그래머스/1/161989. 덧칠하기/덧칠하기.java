class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int idx = section[0];
        
        for (int i = 0; i < section.length - 1; i++) {
            if (section[i + 1] >= idx + m) {
                idx = section[i + 1];
                answer++;
            }
        }
        
        return answer;
    }
}