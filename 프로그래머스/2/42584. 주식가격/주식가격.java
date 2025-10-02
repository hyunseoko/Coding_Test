class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            int j = i + 1;
            while (j < n) {
                count++;
                if (prices[j] < prices[i]) break;
                j++;
            }
            answer[i] = count;
        }
        
        return answer;
    }
}