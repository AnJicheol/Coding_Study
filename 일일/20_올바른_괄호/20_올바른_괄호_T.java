import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>(s.length());

        if(s.charAt(s.length() - 1) == '(') return false;
        if(s.charAt(0) == ')') return false; 

        stack.offerFirst(s.charAt(0));

        for(int i = 1; i < s.length(); i ++){
            char ch = s.charAt(i); 

            if(ch == ')' && stack.isEmpty()) return false;
            if(ch == ')' && stack.peek() == '(') {
                stack.pop();
                continue;
            }           
            stack.offerFirst(s.charAt(i));
        }

        return stack.size() == 0;
    }
}
