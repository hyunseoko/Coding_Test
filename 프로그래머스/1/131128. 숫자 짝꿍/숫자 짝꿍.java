class Solution {
    public String solution(String X, String Y) {
        int[] Xcount = new int[10];
        int[] Ycount = new int[10];

        for (int i = 0; i < X.length(); i++) {
            Xcount[X.charAt(i) - '0']++;
        }
        for (int i = 0; i < Y.length(); i++) {
            Ycount[Y.charAt(i) - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int d = 9; d >= 0; d--) {
            int common = Math.min(Xcount[d], Ycount[d]);
            for (int k = 0; k < common; k++) sb.append(d);
        }

        if (sb.length() == 0) return "-1"; 
        if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}