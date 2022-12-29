class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int j;
        
        for (int i = 0; i < s.length(); i++) {
            for (j = i-1; j >= 0; j--) {
                if (s.charAt(j) == s.charAt(i)) {
                    j = i - j;
                    break;
                }
            }
            answer[i] = j;
        }
        
        return answer;
    }
}


테스트 1 〉	통과 (0.02ms, 77.1MB)
테스트 2 〉	통과 (0.17ms, 77.3MB)
테스트 3 〉	통과 (0.13ms, 78MB)
테스트 4 〉	통과 (0.89ms, 76.9MB)
테스트 5 〉	통과 (7.07ms, 80.3MB)
테스트 6 〉	통과 (4.58ms, 76.3MB)
테스트 7 〉	통과 (12.10ms, 86.5MB)
테스트 8 〉	통과 (5.92ms, 75.2MB)
테스트 9 〉	통과 (8.40ms, 84.6MB)
테스트 10 〉	통과 (3.00ms, 80.1MB)
테스트 11 〉	통과 (6.61ms, 81.9MB)
테스트 12 〉	통과 (0.02ms, 76MB)
테스트 13 〉	통과 (0.02ms, 67.7MB)
테스트 14 〉	통과 (0.43ms, 76.7MB)
테스트 15 〉	통과 (0.03ms, 73.4MB)
테스트 16 〉	통과 (0.03ms, 73.4MB)
테스트 17 〉	통과 (0.08ms, 75.7MB)
테스트 18 〉	통과 (2.41ms, 74MB)
테스트 19 〉	통과 (3.03ms, 83MB)
테스트 20 〉	통과 (0.73ms, 78.2MB)
테스트 21 〉	통과 (0.08ms, 69.4MB)
테스트 22 〉	통과 (7.96ms, 77.6MB)
테스트 23 〉	통과 (0.79ms, 77.8MB)
테스트 24 〉	통과 (0.73ms, 80MB)
테스트 25 〉	통과 (0.99ms, 79.6MB)
테스트 26 〉	통과 (0.17ms, 76.2MB)
테스트 27 〉	통과 (0.95ms, 74.9MB)
테스트 28 〉	통과 (0.86ms, 74.6MB)
테스트 29 〉	통과 (0.02ms, 67.6MB)
테스트 30 〉	통과 (8.09ms, 82.3MB)
