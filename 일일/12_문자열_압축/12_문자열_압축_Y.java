import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        int num = 0;
        
        int s_len_half = 0;
        
        s_len_half = s.length() /2;
        if(s_len_half == 0){
            s_len_half = 1;
        }
        
        for(int len = 1; len <= s_len_half; len++){
            List<String> string = new ArrayList<String>();
            
            for(int i = 0; i <= s.length()-len; i +=len){ // 문자열 배열 생성
                string.add(s.substring(i, i + len));
            }
            num += s.length()%len; // 남는 문자열은 더함
            
            for(int i = 0; i < string.size(); i ++){
                String str = string.get(i); // 기준 문자열
                for(int j = i; j < string.size(); j ++){
                    if(str.equals(string.get(j))){ // 문자열이 서로 동일한 경우
                        count++;
                        if( j == string.size()-1){ // 문자열의 끝까지 같은 경우
                            i += count-1;
                        }
                    }
                    else{ i = i + count-1; break; } // 문자열이 동일하지 않은 경우
                }
                // 문자열이 반복된 경우 (count의 자릿 수) + 문자열 길이
                if(count >= 2){ num += (int)(Math.log10(count)+1) + str.length();} 
                else{num += str.length();}
                count = 0;
            }
            //System.out.println(string);
            //System.out.println("answer : " + answer);
            if(len == 1){ answer = num; } // 맨 처음에는 num을 그대로 넣음
            if(answer > num){ answer = num; } // 문자열이 제일 짧은 것을 찾음
            num = 0;
        }
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.09ms, 78MB)
테스트 2 〉	통과 (0.66ms, 74.6MB)
테스트 3 〉	통과 (0.34ms, 71.9MB)
테스트 4 〉	통과 (0.11ms, 74.9MB)
테스트 5 〉	통과 (0.03ms, 64.2MB)
테스트 6 〉	통과 (0.15ms, 73.8MB)
테스트 7 〉	통과 (1.11ms, 76.5MB)
테스트 8 〉	통과 (0.68ms, 77MB)
테스트 9 〉	통과 (0.87ms, 71.6MB)
테스트 10 〉	통과 (4.36ms, 77.6MB)
테스트 11 〉	통과 (0.18ms, 74.9MB)
테스트 12 〉	통과 (0.22ms, 74.6MB)
테스트 13 〉	통과 (0.43ms, 74.2MB)
테스트 14 〉	통과 (0.94ms, 71.6MB)
테스트 15 〉	통과 (0.20ms, 77.3MB)
테스트 16 〉	통과 (0.04ms, 70.3MB)
테스트 17 〉	통과 (2.04ms, 70.2MB)
테스트 18 〉	통과 (1.31ms, 68.1MB)
테스트 19 〉	통과 (1.60ms, 76.8MB)
테스트 20 〉	통과 (3.99ms, 70.7MB)
테스트 21 〉	통과 (2.93ms, 77.5MB)
테스트 22 〉	통과 (4.58ms, 71.8MB)
테스트 23 〉	통과 (3.33ms, 84.8MB)
테스트 24 〉	통과 (3.32ms, 77.1MB)
테스트 25 〉	통과 (3.47ms, 73.3MB)
테스트 26 〉	통과 (3.23ms, 79.4MB)
테스트 27 〉	통과 (3.32ms, 77.7MB)
테스트 28 〉	통과 (0.10ms, 83MB)
