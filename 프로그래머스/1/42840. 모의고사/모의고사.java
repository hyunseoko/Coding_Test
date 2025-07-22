import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] pattern1 = {1,2,3,4,5};
        int[] pattern2 = {2,1,2,3,2,4,2,5};
        int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};
        int[] count = {0,0,0};
        
        for (int i=0; i<answers.length; i++){
            if (answers[i]==pattern1[i%pattern1.length]) count[0]++;
            if (answers[i]==pattern2[i%pattern2.length]) count[1]++;
            if (answers[i]==pattern3[i%pattern3.length]) count[2]++;
        }
        
        int maxScore = Math.max(count[0], Math.max(count[1], count[2]));
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (count[i] == maxScore) result.add(i + 1);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}