import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int swap = 0;

        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                swap = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = swap;
            }
        }
        
        int max1 = sizes[0][0];
        int max2 = sizes[0][1];
        
        for(int i = 0; i < sizes.length; i++){
            if(max1 < sizes[i][0]){max1 = sizes[i][0];}
            if(max2 < sizes[i][1]){max2 = sizes[i][1];}
        }
        
        //System.out.println(max1 + " " + max2);
        
        answer = max1 * max2;
        return answer;
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.02ms, 72.7MB)
테스트 2 〉	통과 (0.01ms, 73.6MB)
테스트 3 〉	통과 (0.02ms, 76.9MB)
테스트 4 〉	통과 (0.02ms, 76.8MB)
테스트 5 〉	통과 (0.02ms, 84.5MB)
테스트 6 〉	통과 (0.02ms, 76.1MB)
테스트 7 〉	통과 (0.03ms, 80MB)
테스트 8 〉	통과 (0.02ms, 71.3MB)
테스트 9 〉	통과 (0.02ms, 72.7MB)
테스트 10 〉	통과 (0.04ms, 77.8MB)
테스트 11 〉	통과 (0.03ms, 66.7MB)
테스트 12 〉	통과 (0.04ms, 74.3MB)
테스트 13 〉	통과 (0.12ms, 72.9MB)
테스트 14 〉	통과 (0.22ms, 80.2MB)
테스트 15 〉	통과 (0.47ms, 76MB)
테스트 16 〉	통과 (0.79ms, 87MB)
테스트 17 〉	통과 (1.32ms, 83.6MB)
테스트 18 〉	통과 (1.31ms, 88.4MB)
테스트 19 〉	통과 (1.20ms, 82.6MB)
테스트 20 〉	통과 (2.18ms, 83.5MB)
