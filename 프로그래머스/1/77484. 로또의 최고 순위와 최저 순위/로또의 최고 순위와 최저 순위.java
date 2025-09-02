class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count_zero = 0;
        int count_match = 0;
        
        for (int i=0; i<6; i++){
            if (lottos[i] == 0) count_zero++;
            else {
                for (int j=0; j<6; j++) {
                    if (lottos[i] == win_nums[j]) count_match++;
                }
            }
        }
        
        int maxRank = 7 - (count_match + count_zero);
        int minRank = 7 - count_match;

        if (maxRank > 6) maxRank = 6;
        if (minRank > 6) minRank = 6;
        
        return new int[] {maxRank, minRank};
    }
}