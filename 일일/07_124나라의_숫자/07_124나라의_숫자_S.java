class Solution {
    public String solution(int n) {
        String answer = "";
        int remainder;
        StringBuilder builder = new StringBuilder(answer);
        while(n > 0) {
            remainder = n%3;
            if (remainder == 0) {
                remainder = 4;
                n = n/3 -1;
            }
            else  n /= 3;
            builder.insert(0, remainder);
        }
        answer = builder.toString();
        return answer;
    }
}


정확성  테스트
테스트 1 〉	통과 (0.08ms, 73.6MB)
테스트 2 〉	통과 (0.04ms, 73.6MB)
테스트 3 〉	통과 (0.07ms, 74.2MB)
테스트 4 〉	통과 (0.06ms, 73.8MB)
테스트 5 〉	통과 (0.07ms, 75.7MB)
테스트 6 〉	통과 (0.05ms, 77.4MB)
테스트 7 〉	통과 (0.05ms, 81.1MB)
테스트 8 〉	통과 (0.05ms, 72.6MB)
테스트 9 〉	통과 (0.04ms, 68MB)
테스트 10 〉	통과 (0.05ms, 74.7MB)
테스트 11 〉	통과 (0.07ms, 78.7MB)
테스트 12 〉	통과 (0.04ms, 78.1MB)
테스트 13 〉	통과 (0.05ms, 75.8MB)
테스트 14 〉	통과 (0.05ms, 83.1MB)
효율성  테스트
테스트 1 〉	통과 (0.06ms, 51.8MB)
테스트 2 〉	통과 (0.09ms, 51.6MB)
테스트 3 〉	통과 (0.09ms, 52.1MB)
테스트 4 〉	통과 (0.08ms, 52MB)
테스트 5 〉	통과 (0.08ms, 52.1MB)
테스트 6 〉	통과 (0.07ms, 52.2MB)
