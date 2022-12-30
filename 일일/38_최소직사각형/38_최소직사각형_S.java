class Solution {
    public int solution(int[][] sizes) {
        int[] len = new int[2];
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] >= sizes[i][1]) {
                if (sizes[i][0] > len[0]) len[0] = sizes[i][0];
                if (sizes[i][1] > len[1]) len[1] = sizes[i][1];
            }
            else {
                if (sizes[i][1] > len[0]) len[0] = sizes[i][1];
                if (sizes[i][0] > len[1]) len[1] = sizes[i][0];
            }
        }
        
        return len[0] * len[1];
    }
}


테스트 1 〉	통과 (0.02ms, 72.7MB)
테스트 2 〉	통과 (0.03ms, 69.3MB)
테스트 3 〉	통과 (0.02ms, 78.2MB)
테스트 4 〉	통과 (0.02ms, 70.3MB)
테스트 5 〉	통과 (0.02ms, 67MB)
테스트 6 〉	통과 (0.02ms, 75.8MB)
테스트 7 〉	통과 (0.02ms, 74.2MB)
테스트 8 〉	통과 (0.02ms, 76.8MB)
테스트 9 〉	통과 (0.02ms, 82.9MB)
테스트 10 〉	통과 (0.02ms, 75.1MB)
테스트 11 〉	통과 (0.05ms, 76.5MB)
테스트 12 〉	통과 (0.03ms, 79MB)
테스트 13 〉	통과 (0.08ms, 71.4MB)
테스트 14 〉	통과 (0.18ms, 81.2MB)
테스트 15 〉	통과 (0.27ms, 79.9MB)
테스트 16 〉	통과 (0.48ms, 87.7MB)
테스트 17 〉	통과 (0.79ms, 91MB)
테스트 18 〉	통과 (0.79ms, 87.9MB)
테스트 19 〉	통과 (0.86ms, 83.1MB)
테스트 20 〉	통과 (1.31ms, 92.7MB)
