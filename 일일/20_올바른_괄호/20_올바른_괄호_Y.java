class Solution {
    boolean solution(String s) {
        int count = 0;
        
        if(s.charAt(0) == ')' || s.charAt(s.length()-1)=='('){ // 처음과 끝이 열린 괄호면 false
            return false;
        }
        else{
            for(int i = 0; i < s.length(); i ++){
                if(s.charAt(i) == '('){count++;}
                else{
                    count--;
                    if(count == -1){return false;} // 짝이 안맞으면 false
                }
            }
        }
        
        //System.out.println(count);
        if(count != 0){return false;}
        
        return true;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
정확성  테스트
테스트 1 〉	통과 (0.03ms, 72.5MB)
테스트 2 〉	통과 (0.02ms, 74.5MB)
테스트 3 〉	통과 (0.02ms, 73.5MB)
테스트 4 〉	통과 (0.03ms, 74.9MB)
테스트 5 〉	통과 (0.03ms, 73.9MB)
테스트 6 〉	통과 (0.02ms, 75MB)
테스트 7 〉	통과 (0.03ms, 77MB)
테스트 8 〉	통과 (0.02ms, 75.8MB)
테스트 9 〉	통과 (0.02ms, 83.8MB)
테스트 10 〉	통과 (0.02ms, 75.3MB)
테스트 11 〉	통과 (0.02ms, 73.4MB)
테스트 12 〉	통과 (0.04ms, 73MB)
테스트 13 〉	통과 (0.04ms, 74.3MB)
테스트 14 〉	통과 (0.04ms, 75.6MB)
테스트 15 〉	통과 (0.04ms, 72.5MB)
테스트 16 〉	통과 (0.04ms, 70.1MB)
테스트 17 〉	통과 (0.02ms, 69.4MB)
테스트 18 〉	통과 (0.02ms, 77.5MB)
효율성  테스트
테스트 1 〉	통과 (6.95ms, 52MB)
테스트 2 〉	통과 (6.48ms, 52.1MB)
