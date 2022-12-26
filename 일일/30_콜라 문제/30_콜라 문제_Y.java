class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n/a > 0){
            answer += n/a * b;
            n = (n/a * b) + (n%a);
        }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
테스트 1 〉	통과 (0.02ms, 75.8MB)
테스트 2 〉	통과 (0.04ms, 73.9MB)
테스트 3 〉	통과 (0.01ms, 69.9MB)
테스트 4 〉	통과 (0.03ms, 74.4MB)
테스트 5 〉	통과 (0.02ms, 78.9MB)
테스트 6 〉	통과 (0.01ms, 79.8MB)
테스트 7 〉	통과 (0.02ms, 79.1MB)
테스트 8 〉	통과 (0.05ms, 75.1MB)
테스트 9 〉	통과 (0.02ms, 87.3MB)
테스트 10 〉	통과 (0.03ms, 74.5MB)
테스트 11 〉	통과 (0.02ms, 77.5MB)
테스트 12 〉	통과 (0.15ms, 72MB)
테스트 13 〉	통과 (0.02ms, 75.8MB)
테스트 14 〉	통과 (0.02ms, 77.4MB)
