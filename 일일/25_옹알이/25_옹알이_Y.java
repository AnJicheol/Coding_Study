import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int count = 0;
        String[] can = {"aya", "ye", "woo", "ma"};
        String[] cant = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(int i = 0; i < babbling.length; i++){
                
            for(int j = 0; j < 4; j ++){
                if(babbling[i].contains(cant[j])){count = 1; break;}
            }
            if(count == 1){count = 0; continue;}
            else{
                for(int j = 0; j < 4; j ++){
                    babbling[i] = babbling[i].replace(can[j],"!");
                }
            }
            if(babbling[i].matches("^[!]*$")){answer++;} // 문자열 시작(^) !가 0번이상 반복(*) 문자열 끝($)
            //System.out.println(Arrays.toString(babbling));
        }
        
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.20ms, 72.4MB)
테스트 2 〉	통과 (0.45ms, 71.7MB)
테스트 3 〉	통과 (0.29ms, 76.1MB)
테스트 4 〉	통과 (0.20ms, 75.4MB)
테스트 5 〉	통과 (0.23ms, 73.7MB)
테스트 6 〉	통과 (0.24ms, 77.4MB)
테스트 7 〉	통과 (0.28ms, 85.6MB)
테스트 8 〉	통과 (0.20ms, 81.1MB)
테스트 9 〉	통과 (0.43ms, 88.4MB)
테스트 10 〉	통과 (0.32ms, 75.3MB)
테스트 11 〉	통과 (0.34ms, 74.5MB)
테스트 12 〉	통과 (1.25ms, 79.9MB)
테스트 13 〉	통과 (5.23ms, 72.8MB)
테스트 14 〉	통과 (1.82ms, 70.7MB)
테스트 15 〉	통과 (0.67ms, 74.2MB)
테스트 16 〉	통과 (2.62ms, 78.7MB)
테스트 17 〉	통과 (1.74ms, 66.4MB)
테스트 18 〉	통과 (0.38ms, 71.4MB)
테스트 19 〉	통과 (1.02ms, 73.1MB)
테스트 20 〉	통과 (1.63ms, 74.9MB)
