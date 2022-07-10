@@@@@@@@@@@@@@@ StringBuilder가 아닌 long 형으로 값을 구한 버전 @@@@@@@@@@@
class Solution {
    public String solution(int n) {
        String answer = "";
        int remainder;
        long sum = 0L;
        long digit = 1L;
        
        while(n > 0) {
            remainder = n%3;
            if (remainder == 0) {
                remainder = 4;
                n = n/3 -1;
            }
            else  n /= 3;
            sum += remainder * digit;
            digit *= 10L;
        }
        answer = Long.toString(sum);
        return answer;
    }
}


정확성  테스트
테스트 1 〉	통과 (0.05ms, 76.9MB)
테스트 2 〉	통과 (0.05ms, 71.2MB)
테스트 3 〉	통과 (0.05ms, 74.5MB)
테스트 4 〉	통과 (0.05ms, 83.9MB)
테스트 5 〉	통과 (0.06ms, 77.5MB)
테스트 6 〉	통과 (0.07ms, 74.9MB)
테스트 7 〉	통과 (0.05ms, 76.7MB)
테스트 8 〉	통과 (0.05ms, 77.6MB)
테스트 9 〉	통과 (0.05ms, 74.1MB)
테스트 10 〉통과 (0.04ms, 72.9MB)
테스트 11 〉통과 (0.04ms, 76.8MB)
테스트 12 〉통과 (0.05ms, 74.4MB)
테스트 13 〉통과 (0.05ms, 76.3MB)
테스트 14 〉통과 (0.06ms, 69.3MB)
효율성  테스트
테스트 1 〉	통과 (0.05ms, 51.9MB)
테스트 2 〉	통과 (0.07ms, 51.8MB)
테스트 3 〉	통과 (0.05ms, 51.8MB)
테스트 4 〉	통과 (0.05ms, 52.2MB)
테스트 5 〉	통과 (0.05ms, 51.9MB)
테스트 6 〉	통과 (0.05ms, 51.9MB)
