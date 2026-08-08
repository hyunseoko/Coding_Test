class Solution {
    public int solution(long num) {
        int answer = -1;
        
        for (long i = 0; i < 500; i++) {
            if (num == 1) {
                answer = (int)i;
                break;
            }
            
            else if (num % 2 == 0) num /= 2;
            else if (num % 2 != 0) num = (num * 3) + 1;
        }
        
        return answer;
    }
}