import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failure_rate = new double[N];
        double failure_count = 0;
        double win_count = 0;
        
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < stages.length;j++){
                if(stages[j] == i){failure_count++;}
                if(stages[j] >= i){win_count++;}
            }
            if(win_count==0){failure_rate[i-1] = 0;}
            else{failure_rate[i-1] = failure_count/win_count;}
            failure_count=0; win_count=0;
        }
        
        
        double[] failure_rate2 = failure_rate.clone();
        Arrays.sort(failure_rate2);
        //System.out.println(Arrays.toString(failure_rate));
        //System.out.println(Arrays.toString(failure_rate2));
        
        int index = 0;
        for(int i = N-1; i >=0; i--){
            for(int j = 0; j < N; j++){
                if(failure_rate2[i] == failure_rate[j]){
                    failure_rate[j] = -1; 
                    answer[index] = j+1; 
                    index++; 
                    break;}
            }
        }
        
        return answer;
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.40ms, 72.9MB)
테스트 2 〉	통과 (0.91ms, 81.6MB)
테스트 3 〉	통과 (24.61ms, 80MB)
테스트 4 〉	통과 (91.25ms, 83.3MB)
테스트 5 〉	통과 (351.86ms, 87.1MB)
테스트 6 〉	통과 (3.80ms, 81.3MB)
테스트 7 〉	통과 (7.98ms, 79.1MB)
테스트 8 〉	통과 (83.48ms, 94.9MB)
테스트 9 〉	통과 (383.63ms, 100MB)
테스트 10 〉	통과 (43.69ms, 88.8MB)
테스트 11 〉	통과 (130.47ms, 83.9MB)
테스트 12 〉	통과 (67.61ms, 90.3MB)
테스트 13 〉	통과 (134.26ms, 97.2MB)
테스트 14 〉	통과 (0.59ms, 73.8MB)
테스트 15 〉	통과 (12.47ms, 78.4MB)
테스트 16 〉	통과 (5.83ms, 76.1MB)
테스트 17 〉	통과 (14.28ms, 77.1MB)
테스트 18 〉	통과 (20.75ms, 88.9MB)
테스트 19 〉	통과 (2.73ms, 82.7MB)
테스트 20 〉	통과 (9.36ms, 84MB)
테스트 21 〉	통과 (13.24ms, 81.3MB)
테스트 22 〉	통과 (283.00ms, 87.2MB)
테스트 23 〉	통과 (12.08ms, 91.9MB)
테스트 24 〉	통과 (29.37ms, 96.3MB)
테스트 25 〉	통과 (0.40ms, 73.2MB)
테스트 26 〉	통과 (0.50ms, 75.2MB)
테스트 27 〉	통과 (0.34ms, 72.5MB)
