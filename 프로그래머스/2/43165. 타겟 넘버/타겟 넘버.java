import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int n = numbers.length;
        int[] remain = new int[n + 1];
        
        for (int i = n - 1; i >= 0; i--) {
            remain[i] = remain[i + 1] + Math.abs(numbers[i]);
        }
        
        return dfs(0, 0, numbers, target, remain);
    }
    private int dfs(int i, int sum, int[] numbers, int target, int[] remain) {
        if (i == numbers.length) return sum == target ? 1 : 0;
        
        int need = target - sum;
        if (Math.abs(need) > remain[i]) return 0;
        
        int a = dfs(i + 1, sum+numbers[i], numbers, target, remain);
        int b = dfs(i + 1, sum-numbers[i], numbers, target, remain);
        return a + b;
    }
}