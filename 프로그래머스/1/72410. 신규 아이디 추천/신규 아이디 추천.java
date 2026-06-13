class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder();

        new_id = new_id.toLowerCase();

        for (char c : new_id.toCharArray()) {
            if (Character.isLowerCase(c) || Character.isDigit(c)
                    || c == '-' || c == '_' || c == '.') {

                if (c == '.') {
                    if (sb.length() == 0) continue;
                    if (sb.charAt(sb.length() - 1) == '.') continue;
                }

                sb.append(c);
            }
        }

        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') sb.deleteCharAt(sb.length() - 1);

        if (sb.length() == 0) sb.append("a");

        if (sb.length() > 15) {
            sb.setLength(15);

            if (sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        char last = sb.charAt(sb.length() - 1);
        while (sb.length() < 3) sb.append(last);

        return sb.toString();
    }
}