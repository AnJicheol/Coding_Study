import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        float[] f_stage = new float[N];
        float user;
        float f_user;
        
        for(int level = 0; level < N ; level++){ // 1스테이지부터 시작
            f_user = 0;
            user = 0;
            for(int j = 0; j < stages.length; j++){
                if(stages[j] > level+1){ //스테이지를 클리어한 경우
                    user ++;
                }
                else if(stages[j] == level+1){ // 스테이지를 도전중인 경우
                    user ++;
                    f_user++;
                }
            }
            if(user == 0){ //스테이지에 도달한 유저가 없는 경우
                f_stage[level] = 0;
                continue;
            }
            f_stage[level] = f_user/user;
        }
        
        int level = 0;
        
        for(int i = 0; i < f_stage.length; i++){
            float max = -1;
            for(int j = 0; j < f_stage.length; j++){
                    if(max < f_stage[j]){
                        max = f_stage[j];
                        level = j;
                    }
            }
            answer[i] = level+1;
            f_stage[level] = -1;
        }
        return answer;
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.03ms, 77.6MB)
테스트 2 〉	통과 (0.29ms, 75.8MB)
테스트 3 〉	통과 (23.36ms, 80.2MB)
테스트 4 〉	통과 (89.33ms, 97MB)
테스트 5 〉	통과 (382.18ms, 98MB)
테스트 6 〉	통과 (2.24ms, 80.4MB)
테스트 7 〉	통과 (8.10ms, 73.2MB)
테스트 8 〉	통과 (93.30ms, 93.5MB)
테스트 9 〉	통과 (342.43ms, 102MB)
테스트 10 〉	통과 (50.11ms, 93MB)
테스트 11 〉	통과 (95.40ms, 94.5MB)
테스트 12 〉	통과 (61.50ms, 84MB)
테스트 13 〉	통과 (107.69ms, 98.9MB)
테스트 14 〉	통과 (0.12ms, 75.7MB)
테스트 15 〉	통과 (15.00ms, 82.4MB)
테스트 16 〉	통과 (5.32ms, 78.6MB)
테스트 17 〉	통과 (8.03ms, 89MB)
테스트 18 〉	통과 (5.78ms, 77.1MB)
테스트 19 〉	통과 (2.30ms, 75.6MB)
테스트 20 〉	통과 (12.36ms, 80MB)
테스트 21 〉	통과 (11.11ms, 92.3MB)
테스트 22 〉	통과 (260.85ms, 89MB)
테스트 23 〉	통과 (11.18ms, 82.8MB)
테스트 24 〉	통과 (22.91ms, 83.6MB)
테스트 25 〉	통과 (0.02ms, 73.1MB)
테스트 26 〉	통과 (0.01ms, 67.8MB)
테스트 27 〉	통과 (0.02ms, 78.7MB)
