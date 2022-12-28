class Solution {
    public int solution(String t, String p) {
        
        int answer = 0;
        int p_len = p.length();
        String target = "";
        
        for(int i = 0; i <= t.length() - p_len; i ++){
            
            target = t.substring(i, i + p_len);
            if(target.compareTo(p) <= 0 )answer++;
        }
        
        return answer;
    }
}
