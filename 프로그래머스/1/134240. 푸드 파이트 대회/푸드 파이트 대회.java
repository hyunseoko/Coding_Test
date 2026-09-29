

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int[] count = new int[food.length];
        
        for (int i = 0; i < food.length; i++) {
            count[i] = food[i] / 2;
        }
        
        for (int i = 1; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                sb.append(Integer.toString(i));
            }
        }
        sb.append("0");
        for (int i = count.length - 1; i > 0 ; i--) {
            for (int j = 0; j < count[i]; j++) {
                sb.append(Integer.toString(i));
            }
        }
        
        return sb.toString();
    }
}