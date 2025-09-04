class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (String tree : skill_trees) {
            StringBuilder sb = new StringBuilder();
            
            for (int i=0; i<tree.length(); i++) {
                char ch = tree.charAt(i);
                if (skill.indexOf(ch) != -1) sb.append(ch);
            }
            
            if (skill.startsWith(sb.toString())) answer++;
        }
        
        return answer;
    }
}