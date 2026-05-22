class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int cur_health = health;
        int n = attacks.length;
        int seq = 0;
        int idx = 0;
        
        for (int i = 1; i <= attacks[n - 1][0]; i++) {
            // 공격
            if (idx < n && i == attacks[idx][0]) {
                cur_health -= attacks[idx][1];
                seq = 0;
                idx++;
                
                if (cur_health <= 0) return -1;
            }
            // 회복
            else {
                cur_health += bandage[1];
                seq++;
                
                if (seq == bandage[0]) {
                    cur_health += bandage[2];
                    seq = 0;
                }
                if (cur_health > health) cur_health = health;
            }
            
        }
        
        return cur_health;
    }
}