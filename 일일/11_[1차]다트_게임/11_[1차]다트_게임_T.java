import java.lang.Math;

class Solution {
    public int solution(String dartResult) {

        double num = 0;
        int answer = 0;
        int record = 0;     

        for(int i = 0; i < dartResult.length(); i++){
            if(Character.isDigit(dartResult.charAt(i))){
                record = (int)num;
                answer += (int)num;
                num = dartResult.charAt(i) - '0';     

                if(dartResult.charAt(i + 1) == '0'){
                    num = num * 10;
                    i++;
                }
            }
            else{                
                switch(dartResult.charAt(i)){
                    case 'D' : num = num * num; break;
                    case 'T' : num = num * num * num; break;
                    case '*' : num = (num * 2); answer += record; break;
                    case '#' : num = num * (-1); break;  
                    default  : break;    
                }
            }         
        }
        answer += (int)num;               
        return answer;
    }
}
