class Solution {
    public int solution(int n) {
        int answer = 0;
        int first = 0; // 피보나치수 첫 번째
        int second = 1; // 피보나치수 두 번째
      
        for(int i = 2; i<=n; i++){
            answer = (second + first);
            first = second%1234567;
            second = answer%1234567;
        }
        return answer%1234567;
    }
}


정확성  테스트
테스트 1 〉	통과 (0.02ms, 77.1MB)
테스트 2 〉	통과 (0.02ms, 87.7MB)
테스트 3 〉	통과 (0.01ms, 77.9MB)
테스트 4 〉	통과 (0.03ms, 74.6MB)
테스트 5 〉	통과 (0.02ms, 77.9MB)
테스트 6 〉	통과 (0.02ms, 74.3MB)
테스트 7 〉	통과 (0.05ms, 74.8MB)
테스트 8 〉	통과 (0.04ms, 74.9MB)
테스트 9 〉	통과 (0.03ms, 71.9MB)
테스트 10 〉	통과 (0.05ms, 74.1MB)
테스트 11 〉	통과 (0.03ms, 76.4MB)
테스트 12 〉	통과 (0.03ms, 87MB)
테스트 13 〉	통과 (2.00ms, 81MB)
테스트 14 〉	통과 (1.95ms, 76.1MB)
