class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();  

        answer = answer.replaceAll("[^0-9a-z\\-\\_\\.]", "");
        answer = answer.replaceAll("[.]{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");   
        int len = answer.length();

        if(len >= 15 ){                             
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("^[.]|[.]$", "");  
        }

        if(len == 0) return answer = "aaa"; //7단계
        else if (len == 1) return answer += answer + answer;
        else if (len == 2) return answer += answer.charAt(1);

        return answer;
    }
}



@@@@@@@@@@@@@@@@@@@ 시간 @@@@@@@@@@@@@@@@@@@@@@@@
  
  테스트 1 〉	통과 (0.15ms, 74.4MB)
테스트 2 〉	통과 (0.16ms, 76.7MB)
테스트 3 〉	통과 (10.08ms, 78.3MB)
테스트 4 〉	통과 (0.23ms, 75.7MB)
테스트 5 〉	통과 (0.27ms, 74.8MB)
테스트 6 〉	통과 (0.19ms, 75.9MB)
테스트 7 〉	통과 (0.30ms, 71.8MB)
테스트 8 〉	통과 (0.23ms, 70.5MB)
테스트 9 〉	통과 (12.40ms, 78MB)
테스트 10 〉	통과 (0.16ms, 76MB)
테스트 11 〉	통과 (0.33ms, 76.9MB)
테스트 12 〉	통과 (0.49ms, 73.8MB)
테스트 13 〉	통과 (9.31ms, 77.8MB)
테스트 14 〉	통과 (0.25ms, 84.4MB)
테스트 15 〉	통과 (0.29ms, 73.5MB)
테스트 16 〉	통과 (0.52ms, 75.5MB)
테스트 17 〉	통과 (1.10ms, 73.7MB)
테스트 18 〉	통과 (1.88ms, 74.1MB)
테스트 19 〉	통과 (2.07ms, 71MB)
테스트 20 〉	통과 (2.70ms, 77MB)
테스트 21 〉	통과 (2.20ms, 80.2MB)
테스트 22 〉	통과 (2.97ms, 77.2MB)
테스트 23 〉	통과 (1.34ms, 74MB)
테스트 24 〉	통과 (1.87ms, 76.3MB)
테스트 25 〉	통과 (1.31ms, 66.2MB)
테스트 26 〉	통과 (1.16ms, 75.7MB)
