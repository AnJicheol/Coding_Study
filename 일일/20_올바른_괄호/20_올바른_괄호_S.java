import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        stack.addFirst('a');
        
        for (int i = 0; i < s.length(); i++) {
            char next = s.charAt(i);
            if (next == '(') {
                stack.addFirst(next);
            } else {
                if (stack.peek() == '(') stack.poll();
                else return false;
            }
        }
        
        return (stack.size() == 1) ? true : false;
    }
}



정확성  테스트
테스트 1 〉	통과 (0.10ms, 68.7MB)
테스트 2 〉	통과 (0.14ms, 79MB)
테스트 3 〉	통과 (0.15ms, 78.5MB)
테스트 4 〉	통과 (0.18ms, 73.5MB)
테스트 5 〉	통과 (0.15ms, 70.9MB)
테스트 6 〉	통과 (0.12ms, 70.2MB)
테스트 7 〉	통과 (0.14ms, 72.1MB)
테스트 8 〉	통과 (0.12ms, 74.5MB)
테스트 9 〉	통과 (0.15ms, 85.4MB)
테스트 10 〉	통과 (0.13ms, 67.6MB)
테스트 11 〉	통과 (0.15ms, 76.6MB)
테스트 12 〉	통과 (0.20ms, 75.2MB)
테스트 13 〉	통과 (0.25ms, 74.6MB)
테스트 14 〉	통과 (0.19ms, 73.3MB)
테스트 15 〉	통과 (0.19ms, 75.5MB)
테스트 16 〉	통과 (0.19ms, 73.8MB)
테스트 17 〉	통과 (0.17ms, 73.8MB)
테스트 18 〉	통과 (0.21ms, 78.1MB)
효율성  테스트
테스트 1 〉	통과 (16.50ms, 52.6MB)
테스트 2 〉	통과 (15.32ms, 52.3MB)
