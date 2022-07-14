import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i ++){
            sum += d[i];
            if(sum <= budget){
                answer ++;
            }else{
                break;
            }
        }
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.36ms, 77.6MB)
테스트 2 〉	통과 (0.36ms, 76.5MB)
테스트 3 〉	통과 (0.33ms, 71.4MB)
테스트 4 〉	통과 (0.32ms, 74.8MB)
테스트 5 〉	통과 (0.33ms, 73.2MB)
테스트 6 〉	통과 (0.34ms, 75.7MB)
테스트 7 〉	통과 (0.33ms, 77.2MB)
테스트 8 〉	통과 (0.34ms, 77.2MB)
테스트 9 〉	통과 (0.36ms, 74.7MB)
테스트 10 〉	통과 (0.39ms, 70.3MB)
테스트 11 〉	통과 (0.38ms, 85.2MB)
테스트 12 〉	통과 (0.35ms, 77.2MB)
테스트 13 〉	통과 (0.34ms, 76.1MB)
테스트 14 〉	통과 (0.34ms, 76.8MB)
테스트 15 〉	통과 (0.34ms, 73.6MB)
테스트 16 〉	통과 (0.35ms, 76.7MB)
테스트 17 〉	통과 (0.37ms, 83.4MB)
테스트 18 〉	통과 (0.36ms, 75.9MB)
테스트 19 〉	통과 (0.37ms, 74.9MB)
테스트 20 〉	통과 (0.34ms, 76MB)
테스트 21 〉	통과 (0.32ms, 75.9MB)
테스트 22 〉	통과 (0.31ms, 74.5MB)
테스트 23 〉	통과 (0.34ms, 76.1MB)
