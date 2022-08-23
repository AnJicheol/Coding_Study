import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[][] solution = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        int[]num = {0 , 0 , 0};
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == solution[0][i % 5]) num[0]++;
            if(answers[i] == solution[1][i % 8]) num[1]++;
            if(answers[i] == solution[2][i % 10])num[2]++;
        }
        
        int index = 0;
        int max = 0;
        
        for(Integer i : num) if(max <= i) max = i;
        for(Integer i : num) if(max == i) index++;
        
        int[] answer = new int[index];
        index = 0;
        
        for(int i = 0; i < 3; i++){
            if(num[i] == max) {
                answer[index] = i + 1;
                index ++;
            }
        }
        
        return answer;
    }
}
