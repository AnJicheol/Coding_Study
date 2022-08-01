class Solution {
    public int solution(String s) {
        int answer = s.length();
        int count = 0;
        int num = 0;
        int index = 0;

        if(s.length() <= 2){ return s.length(); } // 문자열이 2글자 이하라면 길이 리턴
        
        for(int len = 1; len <= s.length() /2; len++){
            num = s.length()%len; // 남는 문자열 길이
            String string = s.substring(0,len);
            
            for(int j = 0; j < s.length()/len; j+=count){
                count = 0;
                for(int start = index; start <= s.length()-len; start +=len){
                    //System.out.println(string);
                    if(string.equals(s.substring(start, start+len))){ //문자열이 연속될 경우
                        count++;
                        index += len;
                    }else{ // 연속되지 않을 경우
                        string = s.substring(start,start+len);
                        break;
                    }
                }
                if(count >= 2){ num += (int)(Math.log10(count)+1) + string.length();}
                else{num += string.length();}
                
                if(num > answer){break;} //실행도중 answer보다 큰 값이 되었다면 break
            }
            if(num < answer){ answer = num; }
            count = 0;
            index = 0;
        }
        return answer;
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.09ms, 69.8MB)
테스트 2 〉	통과 (0.30ms, 78.6MB)
테스트 3 〉	통과 (0.12ms, 67.7MB)
테스트 4 〉	통과 (0.07ms, 75MB)
테스트 5 〉	통과 (0.03ms, 77.1MB)
테스트 6 〉	통과 (0.05ms, 73.5MB)
테스트 7 〉	통과 (0.54ms, 73.8MB)
테스트 8 〉	통과 (0.48ms, 72.3MB)
테스트 9 〉	통과 (0.73ms, 69.5MB)
테스트 10 〉	통과 (2.94ms, 76.2MB)
테스트 11 〉	통과 (0.14ms, 79.8MB)
테스트 12 〉	통과 (0.10ms, 74.8MB)
테스트 13 〉	통과 (0.14ms, 76.5MB)
테스트 14 〉	통과 (0.72ms, 77.2MB)
테스트 15 〉	통과 (0.12ms, 76MB)
테스트 16 〉	통과 (0.03ms, 71.8MB)
테스트 17 〉	통과 (1.46ms, 70.5MB)
테스트 18 〉	통과 (1.01ms, 71.3MB)
테스트 19 〉	통과 (1.10ms, 75.7MB)
테스트 20 〉	통과 (2.25ms, 80.3MB)
테스트 21 〉	통과 (3.27ms, 81MB)
테스트 22 〉	통과 (3.20ms, 74.9MB)
테스트 23 〉	통과 (2.94ms, 81.5MB)
테스트 24 〉	통과 (2.26ms, 75.1MB)
테스트 25 〉	통과 (4.17ms, 86.8MB)
테스트 26 〉	통과 (2.41ms, 78.1MB)
테스트 27 〉	통과 (2.38ms, 69.9MB)
테스트 28 〉	통과 (0.10ms, 78.5MB)
