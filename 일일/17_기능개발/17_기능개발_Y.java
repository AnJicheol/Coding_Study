import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] box = new int[progresses.length];
        int index = 0;
        int num = 0;
        
        for(int i = 0; i < progresses.length; i++){    
            if((100 - progresses[i]) % speeds[i] != 0){
                progresses[i] = (100 - progresses[i]) / speeds[i];    
                progresses[i]++;
            }else{
                progresses[i] = (100 - progresses[i]) / speeds[i];
            }
        }
        //System.out.println(Arrays.toString(progresses));
        
        num = progresses[0];
        
        for(int i = 0; i < progresses.length; i++){
            if(num >= progresses[i]){ box[index]++; }
            else{num = progresses[i]; index++; box[index]++; }
        }
        
        int[] answer = new int[index+1];
        
        for(int i = 0; i <= index; i ++){
            answer[i] = box[i];
        }
        
        return answer;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.01ms, 75.4MB)
테스트 2 〉	통과 (0.03ms, 72.2MB)
테스트 3 〉	통과 (0.02ms, 80.9MB)
테스트 4 〉	통과 (0.01ms, 78.2MB)
테스트 5 〉	통과 (0.02ms, 75.6MB)
테스트 6 〉	통과 (0.02ms, 71.4MB)
테스트 7 〉	통과 (0.03ms, 78.3MB)
테스트 8 〉	통과 (0.02ms, 73.6MB)
테스트 9 〉	통과 (0.02ms, 74.3MB)
테스트 10 〉	통과 (0.02ms, 74.5MB)
테스트 11 〉	통과 (0.01ms, 78.7MB)
