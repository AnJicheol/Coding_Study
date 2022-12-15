import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        for (int i = score.length-m; i >= 0; i-=m) {
            answer += score[i] * m;
        }
        
        return answer;
    }
}

테스트 1 〉	통과 (0.47ms, 83.9MB)
테스트 2 〉	통과 (0.48ms, 69.7MB)
테스트 3 〉	통과 (0.40ms, 73.5MB)
테스트 4 〉	통과 (0.51ms, 72MB)
테스트 5 〉	통과 (0.52ms, 83.8MB)
테스트 6 〉	통과 (4.95ms, 82MB)
테스트 7 〉	통과 (6.08ms, 85.8MB)
테스트 8 〉	통과 (1.18ms, 73.1MB)
테스트 9 〉	통과 (6.94ms, 79.5MB)
테스트 10 〉	통과 (5.36ms, 75.7MB)
테스트 11 〉	통과 (61.60ms, 141MB)
테스트 12 〉	통과 (41.06ms, 140MB)
테스트 13 〉	통과 (48.80ms, 124MB)
테스트 14 〉	통과 (53.36ms, 126MB)
테스트 15 〉	통과 (46.86ms, 133MB)
테스트 16 〉	통과 (0.44ms, 71.5MB)
테스트 17 〉	통과 (0.41ms, 62.5MB)
테스트 18 〉	통과 (0.44ms, 79.1MB)
테스트 19 〉	통과 (0.44ms, 80.4MB)
테스트 20 〉	통과 (0.40ms, 74.2MB)
테스트 21 〉	통과 (0.38ms, 66.9MB)
테스트 22 〉	통과 (0.42ms, 70.8MB)
테스트 23 〉	통과 (0.42ms, 75.5MB)
테스트 24 〉	통과 (0.34ms, 78.7MB)
