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


테스트 1 〉	통과 (0.18ms, 76MB)
테스트 2 〉	통과 (0.16ms, 72.2MB)
테스트 3 〉	통과 (0.18ms, 74.8MB)
테스트 4 〉	통과 (0.16ms, 74.2MB)
테스트 5 〉	통과 (0.16ms, 72MB)
테스트 6 〉	통과 (0.16ms, 71.8MB)
테스트 7 〉	통과 (0.25ms, 78.4MB)
테스트 8 〉	통과 (0.17ms, 74.6MB)
테스트 9 〉	통과 (0.18ms, 77.2MB)
테스트 10 〉	통과 (0.17ms, 74.5MB)
테스트 11 〉	통과 (0.19ms, 72.6MB)
테스트 12 〉	통과 (0.20ms, 72.4MB)
테스트 13 〉	통과 (0.19ms, 74.1MB)
테스트 14 〉	통과 (0.21ms, 75.7MB)
테스트 15 〉	통과 (0.33ms, 75.3MB)
테스트 16 〉	통과 (0.39ms, 71.9MB)
테스트 17 〉	통과 (0.30ms, 84.8MB)
테스트 18 〉	통과 (0.43ms, 69.1MB)
테스트 19 〉	통과 (0.52ms, 70MB)
테스트 20 〉	통과 (0.47ms, 76.4MB)
테스트 21 〉	통과 (0.39ms, 69MB)
테스트 22 〉	통과 (0.30ms, 76.4MB)
테스트 23 〉	통과 (0.43ms, 76.6MB)
테스트 24 〉	통과 (0.24ms, 70.6MB)
테스트 25 〉	통과 (0.31ms, 72.4MB)
