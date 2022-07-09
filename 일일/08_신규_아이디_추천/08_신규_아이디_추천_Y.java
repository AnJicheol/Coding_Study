class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase(); 
        //replaceAll([정규식],[바꿀문자])
        answer = answer.replaceAll("[^0-9a-z._[-]]","");
        answer = answer.replaceAll("\\.+", ".");
        answer = answer.replaceAll("^\\.|\\.$",""); // 시작과 끝이.이면 제거
        
        // 7단계 
        if(answer.length() <= 2){
            if(answer.isEmpty() == true){ // 5단계
            answer = answer + "a";
            }
            while(answer.length() < 3){
                answer = answer + answer.charAt(answer.length() - 1);
            }
        }else if(answer.length() >= 16){ // 6단계
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("\\.$", "");  
        }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.20ms, 74.8MB)
테스트 2 〉	통과 (11.11ms, 79.9MB)
테스트 3 〉	통과 (10.12ms, 81MB)
테스트 4 〉	통과 (0.24ms, 81.7MB)
테스트 5 〉	통과 (0.23ms, 74.4MB)
테스트 6 〉	통과 (0.17ms, 78.3MB)
테스트 7 〉	통과 (0.20ms, 71.6MB)
테스트 8 〉	통과 (0.23ms, 76.1MB)
테스트 9 〉	통과 (9.46ms, 75.5MB)
테스트 10 〉	통과 (0.18ms, 79.3MB)
테스트 11 〉	통과 (0.24ms, 76.1MB)
테스트 12 〉	통과 (0.36ms, 75.9MB)
테스트 13 〉	통과 (9.87ms, 80.7MB)
테스트 14 〉	통과 (0.37ms, 76.4MB)
테스트 15 〉	통과 (0.47ms, 76.7MB)
테스트 16 〉	통과 (0.55ms, 75.7MB)
테스트 17 〉	통과 (1.51ms, 71.5MB)
테스트 18 〉	통과 (1.57ms, 76.8MB)
테스트 19 〉	통과 (2.71ms, 70MB)
테스트 20 〉	통과 (3.19ms, 73.5MB)
테스트 21 〉	통과 (2.41ms, 72.9MB)
테스트 22 〉	통과 (12.10ms, 74.8MB)
테스트 23 〉	통과 (10.47ms, 69MB)
테스트 24 〉	통과 (1.57ms, 74.3MB)
테스트 25 〉	통과 (1.31ms, 72.5MB)
테스트 26 〉	통과 (1.27ms, 75.4MB)
    
    
@@@@@@@@@@@@@@@@@@@@@@@@@@ 피드백 @@@@@@@@@@@@@@@@@@@@@@@@@@
안지철--------------------------------------------------------------
    
8번 코드 charAt은 파라미터로 -1을 주면 마지막 인덱스에 접근할 수 있다

answer = answer + answer.charAt(answer.length() - 1);

5단계는 바로 return answer = "aaa"을 주면 더 효율적일 것이다.
12번째 줄부터 18번째 줄은 switch문으로 대체하면 가독성이나 성능면에서
더 좋을 것 같다

switch(answer.length){
    case 0 : return answer = "aaa";
    case 1 : return answer = answer.repeat(3);
    default : answer = answer + answer.charAt(-1);
      
}
이때 answer,length 가 2일때는 default 에서 실행된다 
따라서 3보다 클때 코드가 선행적으로 실행 되어야 한다


--------------------------------------------------------------
