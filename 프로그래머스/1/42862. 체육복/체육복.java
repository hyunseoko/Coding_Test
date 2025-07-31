class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] stu = new int[n+1];
        for (int i=1; i<=n; i++){
            stu[i] = 1;
        }
        for (int i=0; i<lost.length; i++){
            stu[lost[i]]--;
        }
        for (int i=0; i<reserve.length; i++){
            stu[reserve[i]]++;
        }
        for (int i=1; i<=n; i++){
            if (stu[i] >= 1) answer++;
            else if (stu[i] == 0) {
                if (i != 1 && i != n) {
                    if (stu[i-1] == 2) {
                        stu[i-1]--;
                        stu[i]++;
                        answer++;
                    }
                    else if (stu[i+1] == 2) {
                        stu[i+1]--;
                        stu[i]++;
                        answer++;
                    }
                }
                else if (i == 1){
                    if (stu[i+1] == 2) {
                        stu[i+1]--;
                        stu[i]++;
                        answer++;
                    }
                }
                else if (i == n) {
                    if (stu[i-1] == 2) {
                        stu[i-1]--;
                        stu[i]++;
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}