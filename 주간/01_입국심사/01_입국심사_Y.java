import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long middle = 0;
        long min = 1;
        long max = 0;
        long count = 0;
        
        
        Arrays.sort(times);
        /*
        //배열에서 나올수 있는 가장 짧은 시간
        middle = (long)times[0];
        for(int i = 1; i < times[times.length-1]*n; i++){
            if((i * middle/middle) * times.length >= n){min = i * middle; break;}
        }
        
        //배열에서 나올수 있는 가장 긴 시간
        middle = (long)times[times.length-1];
        for(int i = 1; i < times[times.length-1]*n; i++){
            if((i * middle/middle) * times.length >= n){max = i * middle; break;}
        }
        //System.out.println("min : " + min + " // " + "max : " + max);
        */
        
        
        // 값 찾기
        max = (long)times[times.length-1]*n; // 가장 큰 경우의 수
        
        for(int i = 0; max - min > 1; i++){
            //System.out.println("min : " + min + " // " + "max : " + max);
            middle = (min + max) / 2;
            //System.out.println("middle : " + middle);
            for(int j = 0; j < times.length; j++){
                count += middle/times[j];
                if(count >= n){max = middle; answer = middle; break;} // 
            }
            if(count < n){min = middle;}
            count = 0;
        }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.41ms, 76.3MB)
테스트 2 〉	통과 (0.48ms, 74.9MB)
테스트 3 〉	통과 (1.90ms, 77.1MB)
테스트 4 〉	통과 (75.17ms, 92.8MB)
테스트 5 〉	통과 (101.28ms, 86.8MB)
테스트 6 〉	통과 (87.17ms, 82.1MB)
테스트 7 〉	통과 (76.23ms, 94.6MB)
테스트 8 〉	통과 (114.04ms, 88.1MB)
테스트 9 〉	통과 (0.51ms, 71.5MB)
