import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] arr = str.split("");
        for (int i=0; i<str.length(); i++){
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}