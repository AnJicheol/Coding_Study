import java.util.Arrays;
class Solution {
    public int[] solution(int[] answers) {
        int[] su1 = {1,2,3,4,5};
        int[] su2 = {2,1,2,3,2,4,2,5};
        int[] su3 = {3,3,1,1,2,2,4,4,5,5};

        int[] score = new int [3]; // 점수들
        int max = 0; // 최고 점수
        int count = 0; // 공동 1등
        
        // 점수계산
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == su1[i%su1.length]){
                score[0]+=1; 
            }   
            if(answers[i] == su2[i%su2.length]){
                score[1]+=1;
            }   
            if(answers[i] == su3[i%su3.length]){
                score[2]+=1;
            }   
        }
        // 최고점수 계산
        for(int i = 0; i<3; i++){
            if(max<score[i]){
                max = score[i];
            }
        }
        // 최고점수랑 같은 수포자 찾기
        for(int i = 0; i<3; i++){
            if(max == score[i]){
                count++;
            }
        }
        
        int[] answer = new int [count];
        count = 0;
        
        // 출력
        for(int i = 0; i<3; i++){
            if(max == score[i]){
                answer[count] = i+1;
                count++;
            }
        }
        return answer;
    }
}

테스트 1 〉	통과 (0.01ms, 74.7MB)
테스트 2 〉	통과 (0.02ms, 83.3MB)
테스트 3 〉	통과 (0.02ms, 69.3MB)
테스트 4 〉	통과 (0.02ms, 77.8MB)
테스트 5 〉	통과 (0.02ms, 78.4MB)
테스트 6 〉	통과 (0.02ms, 69.8MB)
테스트 7 〉	통과 (0.31ms, 74.7MB)
테스트 8 〉	통과 (0.11ms, 78.1MB)
테스트 9 〉	통과 (0.87ms, 78.9MB)
테스트 10 〉	통과 (0.27ms, 64.8MB)
테스트 11 〉	통과 (0.76ms, 72MB)
테스트 12 〉	통과 (0.55ms, 77.3MB)
테스트 13 〉	통과 (0.07ms, 72.1MB)
테스트 14 〉	통과 (0.61ms, 71.4MB)
