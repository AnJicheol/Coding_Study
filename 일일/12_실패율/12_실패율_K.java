import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        float[] failed = new float [N]; // 실패율을 담을 변수
        int man_failure = 0; // 현재 스테이지에 남은 인원
        int reduce = 0; // 지금까지 탈락한 인원들

        Arrays.sort(stages);
      
        // @@@@@  총 탈락한 인원, 스테이지마다 탈락한 인원 파악 @@@@@
        for(int i = 0; i<N; i++){ 
            answer[i] = i+1;
            for(int j = reduce; j<stages.length; j++){ 

                if(i == stages[j])  reduce++; 
                
                if(i+1 == stages[j]) man_failure ++;
                else continue; 
            }
          
        //  @@@@@ 실패율 계산 @@@@@
            failed[i] = (float)man_failure/(float)(stages.length - reduce); // 실패율 = 현재 스테이지에서 탈락한 인원들 / (도전자들 - 총 탈락 인원)
            man_failure = 0; // 각 스테이지마다 탈락한 사람들이기 때문에 초기화 해줌
        }
        
        // @@@@@ 버블로 내림차순으로 정렬 @@@@@
        for(int i = 0; i < failed.length; i++) {
            for(int j = 0; j < failed.length-1; j++) {
                 if(failed[j+1] > failed[j]) {

                    float sw = failed[j];
                    failed[j] = failed[j+1];
                    failed[j+1] = sw;

                    int temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;   
                }
            }           
        }
        return answer;
    }
}


정확성  테스트
테스트 1 〉	통과 (0.31ms, 74.6MB)
테스트 2 〉	통과 (0.87ms, 81.1MB)
테스트 3 〉	통과 (12.80ms, 76.6MB)
테스트 4 〉	통과 (37.42ms, 97MB)
테스트 5 〉	통과 (103.12ms, 104MB)
테스트 6 〉	통과 (1.46ms, 77MB)
테스트 7 〉	통과 (6.26ms, 78.1MB)
테스트 8 〉	통과 (29.90ms, 92.3MB)
테스트 9 〉	통과 (86.09ms, 99.1MB)
테스트 10 〉	통과 (21.13ms, 88.8MB)
테스트 11 〉	통과 (37.13ms, 88.1MB)
테스트 12 〉	통과 (34.10ms, 95MB)
테스트 13 〉	통과 (49.31ms, 95.7MB)
테스트 14 〉	통과 (0.40ms, 76.4MB)
테스트 15 〉	통과 (12.05ms, 83.1MB)
테스트 16 〉	통과 (4.00ms, 72MB)
테스트 17 〉	통과 (10.34ms, 84.7MB)
테스트 18 〉	통과 (3.89ms, 81.3MB)
테스트 19 〉	통과 (1.17ms, 74.5MB)
테스트 20 〉	통과 (5.19ms, 85.1MB)
테스트 21 〉	통과 (8.28ms, 90.1MB)
테스트 22 〉	통과 (146.34ms, 90.4MB)
테스트 23 〉	통과 (11.17ms, 86.6MB)
테스트 24 〉	통과 (28.80ms, 98.2MB)
테스트 25 〉	통과 (0.36ms, 75.9MB)
테스트 26 〉	통과 (0.31ms, 75MB)
테스트 27 〉	통과 (0.33ms, 77.3MB)
