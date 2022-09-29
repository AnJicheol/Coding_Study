class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int len = 0;
        
        for(int i = 0; s.length() > 1; i++){
            len = s.length();
            s = s.replace("0", "");
            answer[1] += len - s.length();
            s = Integer.toBinaryString(s.length());       
            answer[0] = i+1;
        }
        return answer;
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.06ms, 77.8MB)
테스트 2 〉	통과 (11.91ms, 94.1MB)
테스트 3 〉	통과 (0.06ms, 75.4MB)
테스트 4 〉	통과 (0.06ms, 66.7MB)
테스트 5 〉	통과 (0.06ms, 66.3MB)
테스트 6 〉	통과 (0.09ms, 73.3MB)
테스트 7 〉	통과 (0.19ms, 77.2MB)
테스트 8 〉	통과 (0.18ms, 74.1MB)
테스트 9 〉	통과 (4.68ms, 92.6MB)
테스트 10 〉	통과 (8.72ms, 77.1MB)
테스트 11 〉	통과 (6.65ms, 85.7MB)
