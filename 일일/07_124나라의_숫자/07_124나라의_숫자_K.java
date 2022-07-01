class Solution {
    public String solution(int n) {
        String answer = "";
        String[] ten = {"0","1","2","4","11","21","41","12","22","42","14" }; // 0부터 10까지의 경우의 수를 뒤집어서 저장
        int share = n; // 몫을 담을 변수
        int remainder = 0; // 나머지를 담을 변수
        
        if (n < 11) 
            answer = answer + ten[n]; // n이 10 보다 작으면 answer + ten[n] 
         
        else {
            while (share > 10) {       // ten에 10까지 저장했기 때문에 몫(share)이 10보다 클때만 반복
                
                remainder = share % 3; // share을 3으로 나눈 나머지를 저장
                share = share / 3;     // share을 3으로 나눈 몫을 저장
               
                if (remainder == 0) {  // 나머지(remainder) 이 0일 경우 remainder = 3 , 몫(share)을 -1로 해줌
                    share -= 1;
                    remainder = 3;
                }
                answer = answer + ten[remainder]; // answer에 나머지를 더해줌
            }
            answer = answer + ten[share]; // answer에 마지막으로 남은 몫(share) 을 더해줌
        }
        answer = new StringBuffer(answer).reverse().toString(); // 나머지 몫 순서대로 들어갔기 때문에 뒤집어줌
        return answer;
    }
}


정확성  테스트
테스트 1 〉	통과 (1.19ms, 74.3MB)
테스트 2 〉	통과 (1.19ms, 77MB)
테스트 3 〉	통과 (1.25ms, 72.2MB)
테스트 4 〉	통과 (1.42ms, 81.7MB)
테스트 5 〉	통과 (1.21ms, 76.9MB)
테스트 6 〉	통과 (1.34ms, 76.2MB)
테스트 7 〉	통과 (1.21ms, 75.2MB)
테스트 8 〉	통과 (1.35ms, 66.3MB)
테스트 9 〉	통과 (1.27ms, 75.1MB)
테스트 10 〉	통과 (1.17ms, 73.5MB)
테스트 11 〉	통과 (1.18ms, 73.5MB)
테스트 12 〉	통과 (1.22ms, 82.9MB)
테스트 13 〉	통과 (1.19ms, 75.5MB)
테스트 14 〉	통과 (1.18ms, 75.1MB)
효율성  테스트
테스트 1 〉	통과 (1.58ms, 52.2MB)
테스트 2 〉	통과 (1.54ms, 52.2MB)
테스트 3 〉	통과 (1.55ms, 52.3MB)
테스트 4 〉	통과 (1.64ms, 52.1MB)
테스트 5 〉	통과 (1.68ms, 52MB)
테스트 6 〉	통과 (1.69ms, 52.1MB)
