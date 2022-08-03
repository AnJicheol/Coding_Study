class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] box = new int[progresses.length];
        int index = 0;
        int count = 0;
        int count2 = 0;
        
        for(int i = 0; i < progresses.length; i++){
            int num = progresses[i];
            for(int j = 0; num < 100; j++){
                num += speeds[i];
                count2 = j;
            }
            
            if(i == 0){ count = count2;}
            
            if(count >= count2){ box[index]++;}
            else{ count = count2; index++; box[index]++;}
        }
        
        int[] answer = new int[index+1];
        
        for(int i = 0; i <= index; i ++){
            answer[i] = box[i];
        }
        
        return answer;
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.02ms, 77.8MB)
테스트 2 〉	통과 (0.03ms, 77.4MB)
테스트 3 〉	통과 (0.06ms, 75.8MB)
테스트 4 〉	통과 (0.03ms, 73.9MB)
테스트 5 〉	통과 (0.02ms, 75.8MB)
테스트 6 〉	통과 (0.03ms, 75.7MB)
테스트 7 〉	통과 (0.03ms, 71.2MB)
테스트 8 〉	통과 (0.02ms, 67.7MB)
테스트 9 〉	통과 (0.02ms, 74.1MB)
테스트 10 〉	통과 (0.05ms, 74.6MB)
테스트 11 〉	통과 (0.02ms, 73.7MB)
