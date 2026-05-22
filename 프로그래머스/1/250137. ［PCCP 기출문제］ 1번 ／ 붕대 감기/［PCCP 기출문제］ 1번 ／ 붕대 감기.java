class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int cur_health = health;
        int seq = 0;
        int prevTime = 0;
        
        for (int i = 0; i < attacks.length; i++) {
            int attackTime = attacks[i][0];
            int damage = attacks[i][1];
            int healTime = attackTime - prevTime - 1;
                
            for (int j = 0; j < healTime; j++) {
                cur_health += bandage[1];
                seq++;
                 
                if (seq == bandage[0]) {
                    cur_health += bandage[2];
                    seq = 0;
                }
                if (cur_health > health) cur_health = health;
            }
            
            cur_health -= damage;
            seq = 0;
              
            if (cur_health <= 0) {
                return -1;
            }
            
            prevTime = attackTime;        
        }
        
        return cur_health;    
    }
}