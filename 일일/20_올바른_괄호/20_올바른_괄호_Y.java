class Solution {
    boolean solution(String s) {
        int count = 0;
        
        if(s.charAt(0) == ')' || s.charAt(s.length()-1)=='('){
            return false;
        }
        
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == '('){count++;}
            else{ count--; }
            
            if(count < 0){return false;} // 열린괄호가 더 많아지는 순간
        }
        
        //System.out.println(count);
        if(count != 0){return false;} // 닫힌 괄호가 더 많으면
        
        return true;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
정확성  테스트
테스트 1 〉	통과 (0.02ms, 76MB)
테스트 2 〉	통과 (0.01ms, 74.3MB)
테스트 3 〉	통과 (0.03ms, 72.7MB)
테스트 4 〉	통과 (0.02ms, 74.1MB)
테스트 5 〉	통과 (0.02ms, 76.9MB)
테스트 6 〉	통과 (0.03ms, 75MB)
테스트 7 〉	통과 (0.03ms, 73.3MB)
테스트 8 〉	통과 (0.04ms, 74.4MB)
테스트 9 〉	통과 (0.02ms, 75MB)
테스트 10 〉통과 (0.03ms, 75.7MB)
테스트 11 〉통과 (0.01ms, 71.2MB)
테스트 12 〉통과 (0.04ms, 77MB)
테스트 13 〉통과 (0.03ms, 75.4MB)
테스트 14 〉통과 (0.03ms, 73.2MB)
테스트 15 〉통과 (0.02ms, 72.2MB)
테스트 16 〉통과 (0.03ms, 71.6MB)
테스트 17 〉통과 (0.03ms, 83.6MB)
테스트 18 〉통과 (0.03ms, 74.1MB)
효율성  테스트
테스트 1 〉	통과 (6.77ms, 52.2MB)
테스트 2 〉	통과 (6.77ms, 52.7MB)
