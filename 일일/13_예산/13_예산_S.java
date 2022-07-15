import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            if (d[i] > budget) {
                return answer;
            }
            answer++;
            budget -= d[i];
        }
        
        return answer;
    }
}


테스트 1 〉	통과 (0.43ms, 78.7MB)
테스트 2 〉	통과 (0.32ms, 75.9MB)
테스트 3 〉	통과 (0.36ms, 75.7MB)
테스트 4 〉	통과 (0.33ms, 77.1MB)
테스트 5 〉	통과 (0.37ms, 77.5MB)
테스트 6 〉	통과 (0.33ms, 82.6MB)
테스트 7 〉	통과 (0.36ms, 74MB)
테스트 8 〉	통과 (0.39ms, 74MB)
테스트 9 〉	통과 (0.36ms, 71.1MB)
테스트 10 〉	통과 (0.37ms, 78.2MB)
테스트 11 〉	통과 (0.37ms, 76.6MB)
테스트 12 〉	통과 (0.33ms, 74.1MB)
테스트 13 〉	통과 (0.41ms, 74.4MB)
테스트 14 〉	통과 (0.35ms, 76.1MB)
테스트 15 〉	통과 (0.37ms, 78.9MB)
테스트 16 〉	통과 (0.34ms, 77.3MB)
테스트 17 〉	통과 (0.34ms, 72.6MB)
테스트 18 〉	통과 (0.56ms, 76.9MB)
테스트 19 〉	통과 (0.36ms, 76.8MB)
테스트 20 〉	통과 (0.34ms, 75.8MB)
테스트 21 〉	통과 (0.45ms, 74.1MB)
테스트 22 〉	통과 (0.33ms, 73.8MB)
테스트 23 〉	통과 (0.50ms, 81.3MB)
