import java.util.ArrayDeque;
import java.util.Deque;

class Solution{
    public int solution(String s){       
        Deque<Character> stack = new ArrayDeque<Character>();
        stack.offerFirst(' ');

        for(int i = 0; i < s.length(); i++){
            
            char ch =  s.charAt(i);

            if(stack.getLast() != ch) stack.offerLast(ch);
            else stack.removeLast();
        }

        return (stack.size() == 1) ? 1 : 0;
    }
}
