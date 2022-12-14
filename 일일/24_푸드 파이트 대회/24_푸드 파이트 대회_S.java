class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            
            for (int j = 0; j < count; j++) {
                sb.append(i);
            }
        }
        
        StringBuilder sb_r = new StringBuilder(sb);
        
        sb = sb.append(0).append(sb_r.reverse());
        
        answer = sb.toString();
        
        return answer;
    }
}


테스트 1 〉	통과 (0.52ms, 77.3MB)
테스트 2 〉	통과 (0.62ms, 88MB)
테스트 3 〉	통과 (0.61ms, 74.1MB)
테스트 4 〉	통과 (0.62ms, 79.2MB)
테스트 5 〉	통과 (0.32ms, 76.2MB)
테스트 6 〉	통과 (0.45ms, 69.9MB)
테스트 7 〉	통과 (0.57ms, 72.8MB)
테스트 8 〉	통과 (0.45ms, 74.8MB)
테스트 9 〉	통과 (0.46ms, 72.5MB)
테스트 10 〉	통과 (0.37ms, 74.8MB)
테스트 11 〉	통과 (0.04ms, 75.1MB)
테스트 12 〉	통과 (0.04ms, 79.2MB)
테스트 13 〉	통과 (0.06ms, 74.1MB)
테스트 14 〉	통과 (0.88ms, 78.1MB)
테스트 15 〉	통과 (0.06ms, 77.9MB)
테스트 16 〉	통과 (0.05ms, 71.7MB)
테스트 17 〉	통과 (0.05ms, 76.9MB)
테스트 18 〉	통과 (0.06ms, 75.4MB)
테스트 19 〉	통과 (0.04ms, 71.6MB)
테스트 20 〉	통과 (0.04ms, 74.2MB)
