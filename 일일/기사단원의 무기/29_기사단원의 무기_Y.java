class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int count = 0;
        double num = 0;
        
        for(int i = 1 ; i <= number; i++){
            num = Math.sqrt(i); // 제곱근(루트)
            //System.out.println(num);
            
            if(num % 1 == 0){ // 제곱근의 값이 정수인경우
                for(int j = 1; j <= num; j++){
                    if(i % j == 0){count++;}
                }
                count = (count * 2) - 1;
            }
            else{ // 제곱근의 값이 실수인경우
                for(int j = 1; j <= num; j++){
                    if(i % j == 0){count++;}
                }
                count = count * 2;
            }
            if(count > limit){answer += power;}
            else{answer += count;}
            count = 0;
        }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (6.21ms, 78.4MB)
테스트 2 〉	통과 (1.68ms, 72.7MB)
테스트 3 〉	통과 (0.69ms, 74.5MB)
테스트 4 〉	통과 (1.93ms, 73.7MB)
테스트 5 〉	통과 (0.46ms, 76.9MB)
테스트 6 〉	통과 (6.85ms, 74.4MB)
테스트 7 〉	통과 (2.69ms, 85.8MB)
테스트 8 〉	통과 (1.72ms, 76.5MB)
테스트 9 〉	통과 (6.92ms, 75.9MB)
테스트 10 〉	통과 (0.82ms, 74.8MB)
테스트 11 〉	통과 (73.10ms, 97.7MB)
테스트 12 〉	통과 (87.53ms, 94.3MB)
테스트 13 〉	통과 (115.23ms, 90.1MB)
테스트 14 〉	통과 (74.07ms, 83.2MB)
테스트 15 〉	통과 (85.67ms, 75.2MB)
테스트 16 〉	통과 (103.74ms, 77.9MB)
테스트 17 〉	통과 (0.02ms, 69.7MB)
테스트 18 〉	통과 (87.76ms, 85MB)
테스트 19 〉	통과 (2.65ms, 77.9MB)
테스트 20 〉	통과 (2.64ms, 80.4MB)
테스트 21 〉	통과 (0.02ms, 73.6MB)
테스트 22 〉	통과 (0.11ms, 77.5MB)
테스트 23 〉	통과 (0.02ms, 79MB)
테스트 24 〉	통과 (97.33ms, 78.2MB)
테스트 25 〉	통과 (77.85ms, 84.6MB)
테스트 26 〉	통과 (0.68ms, 78.8MB)
테스트 27 〉	통과 (0.64ms, 77.2MB)
