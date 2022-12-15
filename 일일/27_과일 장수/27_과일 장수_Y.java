import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int num = score.length/m;
        int index = score.length;
        
        Arrays.sort(score);

        
        for(int i = 0; i < num; i ++){
            index -= m;
            answer += score[index] * m;
        }
        
        
        
        return answer;
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.38ms, 71MB)
테스트 2 〉	통과 (0.35ms, 76.3MB)
테스트 3 〉	통과 (0.41ms, 78MB)
테스트 4 〉	통과 (0.43ms, 72.3MB)
테스트 5 〉	통과 (0.33ms, 71.3MB)
테스트 6 〉	통과 (5.63ms, 85.8MB)
테스트 7 〉	통과 (7.98ms, 92.5MB)
테스트 8 〉	통과 (1.16ms, 79.2MB)
테스트 9 〉	통과 (8.88ms, 105MB)
테스트 10 〉	통과 (4.71ms, 78.5MB)
테스트 11 〉	통과 (37.81ms, 143MB)
테스트 12 〉	통과 (41.05ms, 145MB)
테스트 13 〉	통과 (35.47ms, 124MB)
테스트 14 〉	통과 (47.75ms, 144MB)
테스트 15 〉	통과 (104.95ms, 151MB)
테스트 16 〉	통과 (0.51ms, 81.4MB)
테스트 17 〉	통과 (0.36ms, 78.9MB)
테스트 18 〉	통과 (0.46ms, 78.2MB)
테스트 19 〉	통과 (0.48ms, 83.2MB)
테스트 20 〉	통과 (0.48ms, 74MB)
테스트 21 〉	통과 (0.48ms, 72.5MB)
테스트 22 〉	통과 (0.49ms, 78.1MB)
테스트 23 〉	통과 (0.47ms, 80.6MB)
테스트 24 〉	통과 (0.42ms, 80.1MB)
