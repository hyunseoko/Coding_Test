class Solution {
    public int[] solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        int[] answer = new int[arr.length];
        
        for (int i=arr.length-1, j=0; i>=0; i--, j++){
            answer[j] = arr[i] - '0';
        }
        
        return answer;
    }
}