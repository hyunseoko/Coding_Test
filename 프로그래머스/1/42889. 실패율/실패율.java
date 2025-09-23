import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stay = new int[N+2];
        for (int s: stages) {
            if (1 <= s && s <= N) stay[s]++;
        }
        
        double[] fail = new double[N + 1]; 
        int challengers = stages.length;
        for (int i = 1; i <= N; i++) {
            if (challengers == 0) fail[i] = 0.0;
            else fail[i] = (double) stay[i] / challengers;
            challengers -= stay[i]; 
        }

        Integer[] order = new Integer[N];
        for (int i = 0; i < N; i++) order[i] = i + 1;

        Arrays.sort(order, (a, b) -> {
            int cmp = Double.compare(fail[b], fail[a]);
            if (cmp != 0) return cmp;
            return Integer.compare(a, b);
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) answer[i] = order[i];
        return answer;
    }
}