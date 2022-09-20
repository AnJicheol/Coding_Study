class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int len = 0;
        String len_to_binary;

        while (s.length() != 1) {
            len = s.length();
            s = s.replace("0", "");
            answer[1] += len - s.length();
            s = Integer.toBinaryString(s.length());       
            answer[0]++;
        }

        return answer;
    }
}

테스트 1 〉	통과 (0.05ms, 74.6MB)
테스트 2 〉	통과 (9.99ms, 77.4MB)
테스트 3 〉	통과 (0.04ms, 71.3MB)
테스트 4 〉	통과 (0.08ms, 75.4MB)
테스트 5 〉	통과 (0.06ms, 79.2MB)
테스트 6 〉	통과 (0.22ms, 70.2MB)
테스트 7 〉	통과 (0.33ms, 83.1MB)
테스트 8 〉	통과 (0.26ms, 80.4MB)
테스트 9 〉	통과 (4.03ms, 87MB)
테스트 10 〉	통과 (10.36ms, 80.1MB)
테스트 11 〉	통과 (9.38ms, 80MB)
