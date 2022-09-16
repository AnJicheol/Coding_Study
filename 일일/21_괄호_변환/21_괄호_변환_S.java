import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public String solution(String p) { 
        Deque<String> stack = new ArrayDeque<>();
        String sub;
        int count = 0;
        
        while (!p.equals("")) {
            int index = 0;
            count = 0;
            
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == '(') count++;
                else count--;

                index++;
                if (count == 0) break;
            }
            
            sub = p.substring(0, index);
            stack.addFirst(sub);
            p = p.substring(index);
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < stack.size();) {
            sub = stack.poll();
            count = 0;
            
            for (int j = 0; j < sub.length(); j++) {
                if (sub.charAt(j) == '(') {
                    count++;
                } else {
                    count--;
                    if (count < 0) break;
                }
            }
           
            if (count == 0) {
                answer.insert(0, sub);
            } else {
                answer.insert(0, "(");
                answer.append(")");
                
                sub = sub.substring(1, sub.length()-1);
                
                for (int j = 0; j < sub.length(); j++) {
                    if (sub.charAt(j) == '(') answer.append(')');
                    else answer.append('(');
                }
            }
        }
        
        System.out.println(answer);
        
        return answer.toString();
        
    }
    
}
