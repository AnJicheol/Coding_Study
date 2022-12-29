class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        Long num;
        
        
        for(int i = 0; i < t.length() - len+1 ; i++){
            num = Long.parseLong(t.substring(i,i+len));
            //System.out.println(num);
            if(num <= Long.parseLong(p)){answer++;}
            //System.out.println(t.substring(i,i+p.length()));
        }
        
        return answer;
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (3.93ms, 71MB)
테스트 2 〉	통과 (6.68ms, 74.8MB)
테스트 3 〉	통과 (4.35ms, 77MB)
테스트 4 〉	통과 (4.41ms, 76.8MB)
테스트 5 〉	통과 (4.58ms, 75.9MB)
테스트 6 〉	통과 (3.77ms, 75.9MB)
테스트 7 〉	통과 (8.25ms, 78.2MB)
테스트 8 〉	통과 (3.15ms, 78.2MB)
테스트 9 〉	통과 (2.70ms, 73.7MB)
테스트 10 〉	통과 (0.79ms, 85.4MB)
테스트 11 〉	통과 (5.76ms, 69.1MB)
테스트 12 〉	통과 (8.28ms, 81.4MB)
테스트 13 〉	통과 (12.89ms, 74.7MB)
테스트 14 〉	통과 (5.13ms, 77.4MB)
테스트 15 〉	통과 (6.11ms, 85.2MB)
테스트 16 〉	통과 (4.20ms, 73.6MB)
테스트 17 〉	통과 (6.17ms, 75.4MB)
테스트 18 〉	통과 (6.56ms, 72.1MB)
테스트 19 〉	통과 (2.15ms, 73.1MB)
테스트 20 〉	통과 (2.88ms, 77.4MB)
테스트 21 〉	통과 (0.20ms, 91.1MB)
테스트 22 〉	통과 (1.41ms, 72.9MB)
테스트 23 〉	통과 (3.28ms, 74.8MB)
테스트 24 〉	통과 (0.21ms, 81.3MB)
테스트 25 〉	통과 (0.94ms, 66.8MB)
테스트 26 〉	통과 (0.29ms, 83.5MB)
테스트 27 〉	통과 (0.43ms, 72.4MB)
테스트 28 〉	통과 (0.38ms, 74.1MB)
테스트 29 〉	통과 (0.43ms, 79.9MB)
테스트 30 〉	통과 (2.43ms, 83.1MB)
테스트 31 〉	통과 (0.08ms, 79.2MB)
테스트 32 〉	통과 (0.13ms, 88.5MB)
테스트 33 〉	통과 (0.10ms, 76.6MB)
테스트 34 〉	통과 (0.13ms, 76.3MB)
테스트 35 〉	통과 (0.14ms, 73.3MB)
테스트 36 〉	통과 (0.26ms, 76.8MB)
테스트 37 〉	통과 (0.11ms, 70MB)
테스트 38 〉	통과 (0.15ms, 76.5MB)
