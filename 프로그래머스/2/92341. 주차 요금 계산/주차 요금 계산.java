import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> in = new HashMap<>();
        Map<String, Integer> total = new HashMap<>();
        
        for (String rec : records) {
            String[] sp = rec.split(" ");
            int t = toMin(sp[0]);
            String car = sp[1];
            String typ = sp[2];
            
            if (typ.equals("IN")) {
                in.put(car, t);
            } else {
                int inTime = in.remove(car);
                total.put(car, total.getOrDefault(car, 0) + (t-inTime));
            }
        }
        
        int end = toMin("23:59");
        for (Map.Entry<String, Integer> e : in.entrySet()) {
            String car = e.getKey();
            Integer inTime = e.getValue();
            total.put(car, total.getOrDefault(car, 0) + (end-inTime));
        }
        
        List<String> cars = new ArrayList<>(total.keySet());
        Collections.sort(cars);
        int[] answer = new int[cars.size()];
        
        for (int i=0; i<cars.size(); i++) {
            int t = total.get(cars.get(i));
            answer[i] = calcFee(t, fees);
        }
        
        return answer;
    }
    
    private int toMin(String hhmm) {
        String[] s = hhmm.split(":");
        return Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
    }
    
    private int calcFee(int t, int[] fees) {
        if (t <= fees[0]) return fees[1];
        else {
            int over = t - fees[0];
            int units = (over + fees[2] - 1) / fees[2];
            return fees[1] + units * fees[3];
        }
    }
}