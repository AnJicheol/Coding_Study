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
