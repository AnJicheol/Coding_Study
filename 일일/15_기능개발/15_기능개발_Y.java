import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] box = new int[progresses.length];
        int count = 0; // 기준 횟수
        int count2 = 0; // 비교할 횟수
        int num = 0; // 큐의 맨 앞의 값
        int index = 0; // 답을 넣을 인덱스
        
        Queue<Integer> progresses_queue = new LinkedList<>();
        Queue<Integer> speeds_queue = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++){ // progresses 배열 복사
            progresses_queue.add(progresses[i]);
        }
        for(int i = 0; i < progresses.length; i++){ // speeds 배열 복사
            speeds_queue.add(speeds[i]);
        }
        
        while(progresses_queue.size() > 0){
            count = 0;
            num = progresses_queue.peek(); // peek() : 큐의 맨 첫번째 값  
            while(num < 100){ 
                num += speeds_queue.peek();
                count++;
            }
            if(count2 == 0){ // 처음시작 부분만
                count2 = count;
            }
            
            if(count <= count2){ // 더한 횟수가 적거나 같다면
                progresses_queue.poll(); // poll : 맨 앞에 값 삭제
                speeds_queue.poll();
                box[index]++;
            }else{
                count2 = count;
                index++;
            }
        }
        
        int[] answer = new int[index+1];
        
        for(int i = 0; i <= index;i++){
            answer[i] = box[i];
        }
        
        
        return answer;
    }
}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
테스트 1 〉	통과 (0.12ms, 75.6MB)
테스트 2 〉	통과 (0.25ms, 75.2MB)
테스트 3 〉	통과 (0.29ms, 68MB)
테스트 4 〉	통과 (0.22ms, 74.1MB)
테스트 5 〉	통과 (0.12ms, 73.8MB)
테스트 6 〉	통과 (0.15ms, 75.2MB)
테스트 7 〉	통과 (0.27ms, 78.5MB)
테스트 8 〉	통과 (0.19ms, 76.6MB)
테스트 9 〉	통과 (0.26ms, 75.3MB)
테스트 10 〉	통과 (0.25ms, 76.7MB)
테스트 11 〉	통과 (0.12ms, 71.8MB)
