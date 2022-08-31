import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public String solution(String p) { 
        return main_progress(p);
    }
    
    private String main_progress(String s) {
        if (check_perfect(s)) return s;
        
        int index = split_u_v(s);
        String u = s.substring(0, index);
        String v = s.substring(index);
        
        v = main_progress(v);
        
        if (check_perfect(u)) {
            return u + v;
        } else {
            v = "(" + v + ")";
            
            for (int i = 1; i < u.length()-1; i++) {
                if (u.charAt(i) == '(') v += ")";
                 else v += "(";
            }
            
            return v;
        }
        
        
    }
    
    private boolean check_perfect(String s) {  //올바른 괄호 문자열 확인
        Deque<Character> stack = new ArrayDeque<>();
        stack.addFirst('A');
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.addFirst('(');
            } else {
                if (stack.peek() == '(') stack.poll();
                else return false;
            }
        }
        
        return (stack.size() == 1) ? true : false;
    }
    
    private int split_u_v (String s) {  //u v 나눌 인덱스 정하기
        int count = 0;
        int index = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') count++;
            else count--;
            index++;
            if (count == 0) break;
        }
        return index;
    }
}


정확성  테스트
테스트 1 〉	통과 (0.14ms, 72.4MB)
테스트 2 〉	통과 (8.99ms, 70.8MB)
테스트 3 〉	통과 (0.15ms, 75.1MB)
테스트 4 〉	통과 (13.52ms, 69.1MB)
테스트 5 〉	통과 (0.16ms, 67.2MB)
테스트 6 〉	통과 (7.87ms, 74.9MB)
테스트 7 〉	통과 (11.20ms, 73.8MB)
테스트 8 〉	통과 (0.12ms, 75.2MB)
테스트 9 〉	통과 (7.17ms, 76.1MB)
테스트 10 〉	통과 (9.34ms, 76.7MB)
테스트 11 〉	통과 (9.38ms, 74.6MB)
테스트 12 〉	통과 (8.34ms, 73.5MB)
테스트 13 〉	통과 (17.28ms, 85.5MB)
테스트 14 〉	통과 (9.43ms, 79.2MB)
테스트 15 〉	통과 (14.28ms, 80.8MB)
테스트 16 〉	통과 (8.08ms, 68.3MB)
테스트 17 〉	통과 (11.12ms, 91.9MB)
테스트 18 〉	통과 (8.99ms, 74.3MB)
테스트 19 〉	통과 (10.13ms, 84.1MB)
테스트 20 〉	통과 (8.31ms, 77.5MB)
테스트 21 〉	통과 (8.83ms, 81.1MB)
테스트 22 〉	통과 (10.28ms, 80.8MB)
테스트 23 〉	통과 (8.33ms, 76.1MB)
테스트 24 〉	통과 (7.32ms, 89.1MB)
테스트 25 〉	통과 (8.72ms, 72.6MB)
