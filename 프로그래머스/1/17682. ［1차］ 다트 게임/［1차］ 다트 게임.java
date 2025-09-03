class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int idx = -1;
        int len = dartResult.length();
        int[] sum = new int[3];
        
        for (int i=0; i<len; i++){
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                if (c == '1' && dartResult.charAt(i + 1) == '0' && i+1 < len) {
                    idx++;
                    sum[idx] = 10;
                    i++;
                } else {
                    idx++;
                    sum[idx] = c - '0';
                }
            } else if (c =='S') {
                sum[idx] *= 1;
            } else if (c == 'D') {
                sum[idx] *= sum[idx];
            } else if (c == 'T') {
                sum[idx] = sum[idx]*sum[idx]*sum[idx];
            } else if (c == '*') {
                sum[idx] *= 2;
                if (idx > 0) sum[idx-1] *= 2; 
            } else if (c == '#') {
                sum[idx] *= -1;
            }
        }
        
        answer = sum[0]+sum[1]+sum[2];
        return answer;
    }
}