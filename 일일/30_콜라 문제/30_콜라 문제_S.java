class Solution {
    public int solution(int give, int back, int n) {
        int answer = 0;
        
        while (n >= give) {
            answer += (n / give) * back;
            n = (n / give) * back + (n % give);
        }
        
        return answer;
    }
}


테스트 1 〉	통과 (0.02ms, 72.1MB)
테스트 2 〉	통과 (0.01ms, 72.9MB)
테스트 3 〉	통과 (0.02ms, 83.9MB)
테스트 4 〉	통과 (0.04ms, 94.3MB)
테스트 5 〉	통과 (0.03ms, 72.7MB)
테스트 6 〉	통과 (0.02ms, 78.4MB)
테스트 7 〉	통과 (0.04ms, 77.6MB)
테스트 8 〉	통과 (0.02ms, 71.8MB)
테스트 9 〉	통과 (0.02ms, 73.4MB)
테스트 10 〉	통과 (0.04ms, 86.8MB)
테스트 11 〉	통과 (0.04ms, 73.6MB)
테스트 12 〉	통과 (0.07ms, 66.1MB)
테스트 13 〉	통과 (0.04ms, 76MB)
테스트 14 〉	통과 (0.03ms, 80.1MB)
