import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> result = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        
        for (int i=0; i<record.length; i++){
            String[] parts = record[i].split(" ");
            if (parts[0].equals("Change")) {
                map.put(parts[1], parts[2]);
            }
            if (parts[0].equals("Enter")) map.put(parts[1], parts[2]);
        }
        
        for (int i=0; i<record.length; i++){
            String[] parts = record[i].split(" ");
            if (parts[0].equals("Enter")) {
                String name = map.get(parts[1]);
                result.add(name+"님이 들어왔습니다.");
            }
            if (parts[0].equals("Leave")) {
                String name = map.get(parts[1]);
                result.add(name+"님이 나갔습니다.");
            }
        }
        
        return result.toArray(new String[0]);
    }
}