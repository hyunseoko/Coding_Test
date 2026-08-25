class Solution {
    public boolean solution(String s) {
        String[] arr = s.split(""); 
        if (arr.length == 4 || arr.length == 6) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].matches("[^0-9+$]")) return false;
            }  
        } else return false;
        
        return true;
    }
}