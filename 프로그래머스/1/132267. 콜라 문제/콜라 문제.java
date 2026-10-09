class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n > 1) {
            int num = n / a;
            if (num == 0) break;
            n = num * b + n % a;
            answer += num * b;
        }
        
        return answer;
    }
}