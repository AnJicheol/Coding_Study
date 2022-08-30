import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Deque<Character> stack = new ArrayDeque<>();
        stack.push('A');
        // 처음이 ) 이거나 마지막이 ( 이면 종료
        if(s.charAt(0) == ')') return false;
        if(s.charAt(s.length()-1) == '(') return false;
        // () 만들어지면 제거 
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){   
                stack.addFirst(s.charAt(i));
            }
            else if(stack.peek() == '(' && s.charAt(i) == ')'){ 
                stack.remove();
            }
            else return false; // 제일 위가 ')' 면 종료  
        }
        // 스택 사이즈가 1보다 크면 제거 
        answer = (stack.size() == 1) ? true : false; 
        
        return answer;
    }
}


테스트 1 〉	통과 (0.10ms, 76.4MB)
테스트 2 〉	통과 (0.11ms, 77.6MB)
테스트 3 〉	통과 (0.10ms, 76.9MB)
테스트 4 〉	통과 (0.09ms, 72.9MB)
테스트 5 〉	통과 (0.12ms, 73.6MB)
테스트 6 〉	통과 (0.13ms, 71.8MB)
테스트 7 〉	통과 (0.14ms, 73.8MB)
테스트 8 〉	통과 (0.14ms, 75.9MB)
테스트 9 〉	통과 (0.14ms, 78.9MB)
테스트 10 〉	통과 (0.16ms, 77.8MB)
테스트 11 〉	통과 (0.11ms, 71.4MB)
테스트 12 〉	통과 (0.22ms, 77.6MB)
테스트 13 〉	통과 (0.25ms, 77.4MB)
테스트 14 〉	통과 (0.18ms, 72.3MB)
테스트 15 〉	통과 (0.25ms, 75.9MB)
테스트 16 〉	통과 (0.22ms, 72.9MB)
테스트 17 〉	통과 (0.17ms, 73.7MB)
테스트 18 〉	통과 (0.10ms, 73.4MB)
효율성  테스트
테스트 1 〉	통과 (18.78ms, 52.9MB)
테스트 2 〉	통과 (19.82ms, 52.7MB)
