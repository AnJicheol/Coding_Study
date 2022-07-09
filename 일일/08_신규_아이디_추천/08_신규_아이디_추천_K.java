class Solution {
    public String solution(String new_id) {
        String answer = "";
        String gap = ""; // 5단계 빈 문자열과 비교할때 사용되는 변수
        String match = "[^0-9a-z._[-]]"; // 0~9, a~z . _ - 빼고
        answer = new_id;
        
        // 1단계 대문자를 소문자로 바꿈 
        answer=answer.toLowerCase(); 
        // 2단계 match를 제외한 모든 문자 제거 
        answer=answer.replaceAll(match, ""); 
        // 3단계 .중복이면 . 으로 바꿈  
        answer=answer.replaceAll("\\.+", ".");  
        
        //4단계
        if(answer.charAt(0) == '.'){ // 처음이 . 이면 제거 
           answer= answer.replaceFirst(".", "");
        }
        //5단계
        if(answer.equals(gap)){ // 빈 문자열 인지 확인
            answer = answer + "a";  // answer가 공백이면 a 추가
        } 
        //6단계
        if(answer.length() > 15){
            answer = answer.substring(0,15);  // 15줄 보다 클 경우 15줄 이상은 짜름
        }
        answer = answer.replaceAll("\\.$", ""); // 마지막 . 제거
        //7단계
        while(answer.length()<3){
            answer = answer + answer.charAt(answer.length()-1);  // 길이가 3보다 작으면 반복 , 마지막 문자 더함
        } 
        return answer;
    }
}


테스트 1 〉	통과 (0.13ms, 72.3MB)
테스트 2 〉	통과 (9.44ms, 74.8MB)
테스트 3 〉	통과 (9.77ms, 78.7MB)
테스트 4 〉	통과 (0.53ms, 83.5MB)
테스트 5 〉	통과 (0.46ms, 72.9MB)
테스트 6 〉	통과 (0.16ms, 74.4MB)
테스트 7 〉	통과 (0.17ms, 72.8MB)
테스트 8 〉	통과 (0.45ms, 66.4MB)
테스트 9 〉	통과 (8.88ms, 72MB)
테스트 10 〉	통과 (0.14ms, 76.2MB)
테스트 11 〉	통과 (0.41ms, 75.4MB)
테스트 12 〉	통과 (0.64ms, 77.3MB)
테스트 13 〉	통과 (9.21ms, 86.7MB)
테스트 14 〉	통과 (0.26ms, 72.4MB)
테스트 15 〉	통과 (0.50ms, 72.9MB)
테스트 16 〉	통과 (0.75ms, 74.3MB)
테스트 17 〉	통과 (1.06ms, 77.1MB)
테스트 18 〉	통과 (1.74ms, 79MB)
테스트 19 〉	통과 (2.59ms, 79.3MB)
테스트 20 〉	통과 (2.87ms, 75.9MB)
테스트 21 〉	통과 (2.33ms, 80.5MB)
테스트 22 〉	통과 (12.45ms, 81MB)
테스트 23 〉	통과 (10.84ms, 79.7MB)
테스트 24 〉	통과 (1.56ms, 79.2MB)
테스트 25 〉	통과 (1.69ms, 77MB)
테스트 26 〉	통과 (1.48ms, 74.3MB)

    
    
    
@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 피드백 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    
안지철---------------------------------------------------------------
깔끔하고 직관적인 코드이다 개인적으로 정규식으로 치환하는 코드보다 해당 코드
가 더욱 좋아보인다 성능도 개발자 입장에서 재개발할때 코드 수정이 더욱 좋을 것
같다 단 7단계 코드에서 while이 아닌 스위치문을 사용하면 더 좋을 것 같다 5단계
코드와 합칠 수 있고 가독성 또한 더 좋을 것 같다. 


29 while(answer.length()<3){
30      answer = answer + answer.charAt(answer.length()-1);  // 참고로 마지막 인덱스는 -1로 찾을 수 있다
31 } 


ex)
switch(answer.length){
    case 0 : return answer = "aaa";
    case 1 : return answer = answer.repeat(3);
    default : answer = answer + answer.charAt(-1);
      
}

--------------------------------------------------------------------------------------
    
    
