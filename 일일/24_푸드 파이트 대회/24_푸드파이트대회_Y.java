class Solution {
    public String solution(int[] food) {
        String answer = "";
        int use_food = 0;
        
        for(int i = 1; i < food.length;i++){
            use_food = food[i]/2;
            for(int j = 0; j < use_food; j++){
                answer += Integer.toString(i);
            }
        }
        
        answer += "0";
        
        for(int i = answer.length()-2; i >= 0; i--){ // 앞 문자열 뒤집기
            answer += answer.charAt(i);
        }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (16.79ms, 80.5MB)
테스트 2 〉	통과 (18.49ms, 82.9MB)
테스트 3 〉	통과 (19.18ms, 82.9MB)
테스트 4 〉	통과 (26.62ms, 95MB)
테스트 5 〉	통과 (16.10ms, 72.4MB)
테스트 6 〉	통과 (17.80ms, 80.6MB)
테스트 7 〉	통과 (26.69ms, 97.2MB)
테스트 8 〉	통과 (19.55ms, 83.3MB)
테스트 9 〉	통과 (12.27ms, 78.1MB)
테스트 10 〉	통과 (16.33ms, 75.5MB)
테스트 11 〉	통과 (11.60ms, 80.9MB)
테스트 12 〉	통과 (11.72ms, 73.9MB)
테스트 13 〉	통과 (9.94ms, 82.5MB)
테스트 14 〉	통과 (36.06ms, 103MB)
테스트 15 〉	통과 (10.64ms, 68.1MB)
테스트 16 〉	통과 (14.57ms, 80MB)
테스트 17 〉	통과 (14.28ms, 79.3MB)
테스트 18 〉	통과 (13.96ms, 81.8MB)
테스트 19 〉	통과 (12.91ms, 83.5MB)
테스트 20 〉	통과 (11.44ms, 72.7MB)
