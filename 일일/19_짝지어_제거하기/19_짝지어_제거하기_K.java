import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        stack.push('A');
        
        // 같은 문자 제거
        for(int i = 0; i<s.length(); i++){
            if(stack.peek() != s.charAt(i)){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        // s가 남아있는지 확인
        if(stack.size() == 1){
            answer = 1;
        }
        
        return answer;
    }
}

정확성  테스트
테스트 1 〉	통과 (0.21ms, 66.6MB)
테스트 2 〉	통과 (25.29ms, 81MB)
테스트 3 〉	통과 (22.22ms, 103MB)
테스트 4 〉	통과 (21.31ms, 80MB)
테스트 5 〉	통과 (20.60ms, 87.4MB)
테스트 6 〉	통과 (14.72ms, 80.1MB)
테스트 7 〉	통과 (16.39ms, 80.2MB)
테스트 8 〉	통과 (20.49ms, 74.1MB)
테스트 9 〉	통과 (0.27ms, 75.6MB)
테스트 10 〉	통과 (0.36ms, 77.3MB)
테스트 11 〉	통과 (0.19ms, 77.9MB)
테스트 12 〉	통과 (0.18ms, 81MB)
테스트 13 〉	통과 (0.26ms, 70.7MB)
효율성  테스트
테스트 1 〉	통과 (61.42ms, 61.3MB)
테스트 2 〉	통과 (41.37ms, 56.3MB)
테스트 3 〉	통과 (44.61ms, 59MB)
테스트 4 〉	통과 (46.53ms, 58.3MB)
테스트 5 〉	통과 (44.96ms, 59.1MB)
테스트 6 〉	통과 (44.73ms, 58.3MB)
테스트 7 〉	통과 (84.90ms, 59MB)
테스트 8 〉	통과 (81.44ms, 58.9MB)
