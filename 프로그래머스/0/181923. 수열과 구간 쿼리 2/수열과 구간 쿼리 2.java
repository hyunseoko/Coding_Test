class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int len = queries.length;
        int[] answer = new int[len];
        for (int j=0; j<len; j++){
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            int min = -1;
            for (int i=s; i<=e; i++){
                if (arr[i]>k) {
                    if (min==-1 || min>=arr[i]){
                        min = arr[i];
                    }
                }
            }
            if (min!=k) answer[j] = min;
            else answer[j] = -1;
        }
        return answer;
    }
}