class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_lens = toSecond(video_len);
        int poss = toSecond(pos);
        int op_starts = toSecond(op_start);
        int op_ends = toSecond(op_end);
        
        for (String command: commands) {
            if (op_starts <= poss && poss <= op_ends) poss = op_ends;
            
            if (command.equals("prev")) {
                if (poss < 10) poss = 0;
                else poss -= 10;
            } else if (command.equals("next")) {
                if (poss + 10 > video_lens) poss = video_lens;
                else poss += 10;
            }
        }
        
        if (op_starts <= poss && poss <= op_ends) poss = op_ends;
        
        int min = poss / 60;
        int sec = poss % 60;
        
        String answer = "";
        
        if (min < 10) {
            answer += "0";
            answer += String.valueOf(min);
        } else {
            answer += String.valueOf(min);
        }
        
        answer += ":";
        
        if (sec < 10) {
            answer += "0";
            answer += String.valueOf(sec);
        } else {
            answer += String.valueOf(sec);
        }
        
        return answer;
    }
    
    public int toSecond(String time) {
        String[] part = time.split(":");
        int min = Integer.parseInt(part[0]);
        int sec = Integer.parseInt(part[1]);
        
        return min * 60 + sec;
    }
}