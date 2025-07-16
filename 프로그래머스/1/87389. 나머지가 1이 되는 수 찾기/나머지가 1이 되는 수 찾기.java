class Solution {
    public int solution(int n) {
        int x = n-1;
        for (int i=1; i<n; i++){
            if (n%i==1) {
                x=i;
                break;
            }
        }
        return x;
    }
}