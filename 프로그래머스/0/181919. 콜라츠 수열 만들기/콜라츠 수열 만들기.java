import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while(true){
            if(n%2==0){
                n = n/2;
                list.add(n);
                if(n==1) break;
            }
            else {
                n = 3*n +1;
                list.add(n);
                if(n==1) break;
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            answer[i] = list.get(i).intValue();
        return answer;
    }
}