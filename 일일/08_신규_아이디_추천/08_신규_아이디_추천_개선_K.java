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

        if(answer.length() > 15){
            answer = answer.substring(0,15);  // 15줄 보다 클 경우 15줄 이상은 짜름
        }
       
        answer = answer.replaceAll("\\.$", ""); // 마지막 . 제거

          if(answer.length() == 0)  answer = "aaa"; //7단계
          else if (answer.length() == 1)  answer += answer + answer;
          else if (answer.length() == 2)  answer += answer.charAt(1);
 
        
        return answer;
    }
}
