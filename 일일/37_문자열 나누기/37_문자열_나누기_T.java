class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        char ch = ' ';
        
        for (int i = 0; i < s.length(); i++) {
            
            if (count == 0) {
                ch = s.charAt(i);
                answer++;
            }       
            if (ch == s.charAt(i)) count++;
            if (ch != s.charAt(i)) count--;     
        }
        
        return answer;
    }
}
