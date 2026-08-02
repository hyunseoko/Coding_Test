import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<String> list = new ArrayList<>();
        int idx = 0;
        
        while (n != 0) {
            list.add(Long.toString(n % 10));
            n /= 10;
            idx++;
        }
        
        list.sort(Comparator.reverseOrder());
        answer = Long.parseLong(list.stream().map(String::valueOf).collect(Collectors.joining()));
        
        return answer;
    }
}