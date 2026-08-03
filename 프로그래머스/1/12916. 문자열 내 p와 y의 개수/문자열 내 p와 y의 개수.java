class Solution {
    boolean solution(String s) {
        int cp = 0;
        int cy = 0;
        boolean answer = true;
        
        for (char c : s.toCharArray()) {
            if (c == 'p' || c == 'P') cp++;
            if (c == 'y' || c == 'Y') cy++;
        }
        
        if (cp != cy) answer = false;

        return answer;
    }
}