import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";
        
        for (int i=0; i<participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        for (int i=0; i<completion.length; i++){
            if (map.containsKey(completion[i])) {
                map.put(completion[i], map.get(completion[i]) - 1);
            }
        }
        
        for (int i=0; i<participant.length; i++){
            int count = map.get(participant[i]);
            if (count==1) {
                answer = participant[i];
            }
        }
        return answer;
    }
}