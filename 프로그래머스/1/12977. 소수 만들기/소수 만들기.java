import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int num = nums.length;

        for (int i = 0; i < num - 2; i++) {
            for (int j = i + 1; j < num - 1; j++) {
                for (int k = j + 1; k < num; k++) {
                    int n = nums[i] + nums[j] + nums[k];
                    if (isPrime(n)) answer++;
                }
            }
        }
        
        return answer;
    }
    
    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (int i = 3; i * i <= n; i += 2){
            if (n % i == 0) return false;
        }
        return true;
    }
}