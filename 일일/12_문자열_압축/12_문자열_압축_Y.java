class Solution {
    public int solution(String s) {
        int answer = s.length();
        int count = 0;
        int num = 0;
        int start = 0;

        if(s.length() <= 2){ return s.length(); }
        
        for(int len = 1; len <= s.length() /2; len++){
            num = s.length()%len; // 남는 문자열 길이
            String string = s.substring(0,len);
            
            for(int j = 0; j < s.length()/len; j+=count){
                count = 0;
                while(start <= s.length() - len){
                    if(string.equals(s.substring(start, start+len))){ //문자열이 연속될 경우
                        count++;
                        start += len;
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
            start = 0;
        }
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.09ms, 78.6MB)
테스트 2 〉	통과 (0.29ms, 78.7MB)
테스트 3 〉	통과 (0.11ms, 80.3MB)
테스트 4 〉	통과 (0.09ms, 67.4MB)
테스트 5 〉	통과 (0.02ms, 75.2MB)
테스트 6 〉	통과 (0.08ms, 71.4MB)
테스트 7 〉	통과 (0.49ms, 73.9MB)
테스트 8 〉	통과 (0.34ms, 71.1MB)
테스트 9 〉	통과 (0.53ms, 71.2MB)
테스트 10 〉	통과 (1.92ms, 75.1MB)
테스트 11 〉	통과 (0.10ms, 77.9MB)
테스트 12 〉	통과 (0.13ms, 86.1MB)
테스트 13 〉	통과 (0.12ms, 84.4MB)
테스트 14 〉	통과 (0.47ms, 66.1MB)
테스트 15 〉	통과 (0.11ms, 72.2MB)
테스트 16 〉	통과 (0.03ms, 72.2MB)
테스트 17 〉	통과 (0.99ms, 75.6MB)
테스트 18 〉	통과 (1.03ms, 77.6MB)
테스트 19 〉	통과 (1.07ms, 71.5MB)
테스트 20 〉	통과 (2.80ms, 83.1MB)
테스트 21 〉	통과 (3.21ms, 74.9MB)
테스트 22 〉	통과 (2.74ms, 75.8MB)
테스트 23 〉	통과 (2.29ms, 73.9MB)
테스트 24 〉	통과 (2.11ms, 76.1MB)
테스트 25 〉	통과 (3.09ms, 73.8MB)
테스트 26 〉	통과 (2.34ms, 79.3MB)
테스트 27 〉	통과 (2.05ms, 76.7MB)
테스트 28 〉	통과 (0.06ms, 76.1MB)
