class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] nums = new int[str.length];
        
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        
        int min = nums[0];
        int max = nums[0];
        
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        return Integer.toString(min) + " " + Integer.toString(max);
    }
}