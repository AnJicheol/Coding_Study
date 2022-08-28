import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> ch_stack = new Stack<>();
        ch_stack.push('S');
        
        for(int i = 0; i < s.length(); i++){
            if(ch_stack.peek() == s.charAt(i)){
                ch_stack.pop();
            }
            else{
                ch_stack.push(s.charAt(i));
            }
        }
        //System.out.println(ch_stack);
        
        if(ch_stack.peek()=='S'){return 1;}
        return 0;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.19ms, 74.6MB)
테스트 2 〉	통과 (14.91ms, 86.8MB)
테스트 3 〉	통과 (14.81ms, 75.2MB)
테스트 4 〉	통과 (17.28ms, 85.7MB)
테스트 5 〉	통과 (14.55ms, 80.1MB)
테스트 6 〉	통과 (15.57ms, 76.9MB)
테스트 7 〉	통과 (18.22ms, 74.4MB)
테스트 8 〉	통과 (15.74ms, 77.6MB)
테스트 9 〉	통과 (0.24ms, 76.6MB)
테스트 10 〉	통과 (0.27ms, 79MB)
테스트 11 〉	통과 (0.17ms, 74.2MB)
테스트 12 〉	통과 (0.18ms, 74.1MB)
테스트 13 〉	통과 (0.17ms, 74.4MB)
효율성  테스트
테스트 1 〉	통과 (62.44ms, 61.3MB)
테스트 2 〉	통과 (37.44ms, 56.2MB)
테스트 3 〉	통과 (43.97ms, 58.7MB)
테스트 4 〉	통과 (46.81ms, 58.6MB)
테스트 5 〉	통과 (46.21ms, 58.5MB)
테스트 6 〉	통과 (46.90ms, 58.5MB)
테스트 7 〉	통과 (44.92ms, 59MB)
테스트 8 〉	통과 (46.76ms, 58.5MB)
