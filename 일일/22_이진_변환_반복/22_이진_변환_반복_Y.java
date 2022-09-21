class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int len = 0;
        long num = 0;
        long digit = 1;
        
        for(int i = 0; s.length() > 1; i++){
            len = s.length();
            s = s.replaceAll("0",""); // 0을 제거
            len = len - s.length(); // 제거한 0의 개수
            answer[1] += len;
            len = s.length(); // 0을 제거한 후 길이
            //System.out.println(len);
            for(int j = 0; len > 0; j++){
                num += len%2 * digit;
                digit *= 10;
                len = len/2;
            }
            s = Long.toString(num);
            digit = 1;
            num = 0;
            answer[0]++;
        }

        
        return answer;
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.21ms, 75.2MB)
테스트 2 〉	통과 (22.08ms, 100MB)
테스트 3 〉	통과 (0.15ms, 74.6MB)
테스트 4 〉	통과 (0.15ms, 77.8MB)
테스트 5 〉	통과 (0.17ms, 74.5MB)
테스트 6 〉	통과 (0.60ms, 73.6MB)
테스트 7 〉	통과 (1.89ms, 75.8MB)
테스트 8 〉	통과 (2.04ms, 73.8MB)
테스트 9 〉	통과 (7.51ms, 82.5MB)
테스트 10 〉	통과 (30.82ms, 82.4MB)
테스트 11 〉	통과 (24.76ms, 91.8MB)
