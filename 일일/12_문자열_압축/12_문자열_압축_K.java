class Solution {
    public int solution(String s) {
        int answer = s.length();
        int count = 1; // 똑같은 문자 갯수 파악;
        int b=0; // 문자 길이
        String str=""; // 자를 크기 변수
        String str1=""; // str과 비교햊루 변수
        
        // 문자열 자를 단위 정하기
        for(int i = 1; i<s.length(); i++){
            b=0;
            count = 1;
            str = s.substring(0,i);
            
            // 자른 문자열 비교하기 
            for(int j = i*2; j<=s.length(); j+= i){
                str1 = s.substring(j-i,j);
                if(str.equals(str1) == false && count>1){
                    b += String.valueOf(count).length()+i;
                    count = 0;  
                } 
                else if(str.equals(str1) == false){
                    b += i;
                    count = 0;     
                } 
                count++;  
                str = str1;
            }     
            // 마지막 남은 문자 비교
            if(count > 1){
                b += String.valueOf(count).length()+i;
            }
            else {
                b+=i;
            }
          
            b += s.length()%i;
            
            // 작은 크기 저장
            if(answer > b){
                answer = b;   
            }
        }
        return answer;
    }
}
