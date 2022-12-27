class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        
        for (int i = 2; i <= number; i++) {
            int count = 2;
            
            for (int j = 2; j * j <= i; j++) {
                if ((j * j) == i) count++;
                else if ((i % j) == 0) count += 2;
            }
            
            if (count > limit) count = power;
            
            answer += count;
            
        }
        
        return answer;
    }
}


테스트 1 〉	통과 (5.70ms, 78.6MB)
테스트 2 〉	통과 (2.75ms, 91.1MB)
테스트 3 〉	통과 (0.72ms, 69.2MB)
테스트 4 〉	통과 (2.56ms, 79.4MB)
테스트 5 〉	통과 (0.79ms, 72.8MB)
테스트 6 〉	통과 (9.28ms, 81.7MB)
테스트 7 〉	통과 (1.81ms, 74.4MB)
테스트 8 〉	통과 (1.20ms, 74.4MB)
테스트 9 〉	통과 (5.33ms, 76.5MB)
테스트 10 〉	통과 (0.77ms, 78.2MB)
테스트 11 〉	통과 (70.25ms, 88.1MB)
테스트 12 〉	통과 (85.69ms, 76.1MB)
테스트 13 〉	통과 (71.85ms, 87.4MB)
테스트 14 〉	통과 (91.42ms, 92.8MB)
테스트 15 〉	통과 (85.05ms, 89.2MB)
테스트 16 〉	통과 (86.40ms, 94.6MB)
테스트 17 〉	통과 (0.01ms, 73.8MB)
테스트 18 〉	통과 (79.55ms, 86.9MB)
테스트 19 〉	통과 (1.84ms, 77.5MB)
테스트 20 〉	통과 (1.89ms, 77.1MB)
테스트 21 〉	통과 (0.02ms, 77.2MB)
테스트 22 〉	통과 (0.02ms, 73.6MB)
테스트 23 〉	통과 (0.02ms, 75.4MB)
테스트 24 〉	통과 (89.77ms, 75.3MB)
테스트 25 〉	통과 (96.48ms, 82.2MB)
테스트 26 〉	통과 (0.42ms, 76.1MB)
테스트 27 〉	통과 (0.41ms, 72.7MB)
