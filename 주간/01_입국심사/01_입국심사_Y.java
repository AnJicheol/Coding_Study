import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long middle = 0;
        long min = 1;
        long max = 0;
        long count = 0;
        
        
        Arrays.sort(times);
        
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

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.52ms, 78MB)
테스트 2 〉	통과 (0.59ms, 84.4MB)
테스트 3 〉	통과 (1.72ms, 76.7MB)
테스트 4 〉	통과 (80.93ms, 98.2MB)
테스트 5 〉	통과 (87.99ms, 79.9MB)
테스트 6 〉	통과 (73.64ms, 88.1MB)
테스트 7 〉	통과 (113.76ms, 89.1MB)
테스트 8 〉	통과 (118.44ms, 83.3MB)
테스트 9 〉	통과 (4506.52ms, 93.2MB)
