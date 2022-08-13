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



테스트 1 〉	통과 (0.05ms, 77.9MB)
테스트 2 〉	통과 (0.38ms, 77.8MB)
테스트 3 〉	통과 (0.12ms, 75.7MB)
테스트 4 〉	통과 (0.04ms, 74.2MB)
테스트 5 〉	통과 (0.01ms, 81MB)
테스트 6 〉	통과 (0.06ms, 70.4MB)
테스트 7 〉	통과 (0.26ms, 73.5MB)
테스트 8 〉	통과 (0.26ms, 76.4MB)
테스트 9 〉	통과 (0.38ms, 74.8MB)
테스트 10 〉	통과 (1.45ms, 75.4MB)
테스트 11 〉	통과 (0.07ms, 74.3MB)
테스트 12 〉	통과 (0.08ms, 73.6MB)
테스트 13 〉	통과 (0.08ms, 74.1MB)
테스트 14 〉	통과 (0.37ms, 78.1MB)
테스트 15 〉	통과 (0.09ms, 72.9MB)
테스트 16 〉	통과 (0.03ms, 67.8MB)
테스트 17 〉	통과 (0.92ms, 78.9MB)
테스트 18 〉	통과 (0.51ms, 75.6MB)
테스트 19 〉	통과 (0.60ms, 77.3MB)
테스트 20 〉	통과 (1.46ms, 75.7MB)
테스트 21 〉	통과 (1.56ms, 82.6MB)
테스트 22 〉	통과 (1.41ms, 76.2MB)
테스트 23 〉	통과 (1.51ms, 78.9MB)
테스트 24 〉	통과 (1.44ms, 72.1MB)
테스트 25 〉	통과 (1.81ms, 74.3MB)
테스트 26 〉	통과 (1.50ms, 75.4MB)
테스트 27 〉	통과 (1.32ms, 76.1MB)
테스트 28 〉	통과 (0.04ms, 77.9MB)
