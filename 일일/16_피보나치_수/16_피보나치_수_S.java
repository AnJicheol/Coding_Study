class Solution {
    public int solution(int n) {
        int num = 0;
        int num2 = 1;
        int tmp;
        
        for (int i = 0; i < n-2; i++) {
            tmp = num2;
            num2 = (num2 + num) % 1234567;
            num = tmp;
        }
        
        return (num + num2) % 1234567;
    }
}



테스트 1 〉	통과 (0.02ms, 70.4MB)
테스트 2 〉	통과 (0.02ms, 77.3MB)
테스트 3 〉	통과 (0.01ms, 72.6MB)
테스트 4 〉	통과 (0.02ms, 74.4MB)
테스트 5 〉	통과 (0.02ms, 70.5MB)
테스트 6 〉	통과 (0.02ms, 73MB)
테스트 7 〉	통과 (0.05ms, 85.8MB)
테스트 8 〉	통과 (0.06ms, 78.4MB)
테스트 9 〉	통과 (0.04ms, 77.7MB)
테스트 10 〉	통과 (0.09ms, 73.3MB)
테스트 11 〉	통과 (0.08ms, 75.7MB)
테스트 12 〉	통과 (0.04ms, 83.8MB)
테스트 13 〉	통과 (2.18ms, 70.9MB)
테스트 14 〉	통과 (1.90ms, 78.5MB)
