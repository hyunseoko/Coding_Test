class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] arr = new boolean[10];
        
        for (int num : numbers) {
            arr[num] = true;
        }
        
        for (int i = 0; i < 10; i++) {
            if (arr[i] == false) answer += i;
        }
        
        return answer;
    }
}