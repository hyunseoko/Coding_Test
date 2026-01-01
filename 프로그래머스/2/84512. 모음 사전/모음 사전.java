class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] w = {781, 156, 31, 6, 1};
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            answer += "AEIOU".indexOf(c) * w[i] + 1;
        }
        
        return answer;
    }
}