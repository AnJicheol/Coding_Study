#################################  큐를 이용한 풀이  ###################################

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int sum = 1;
        int num = 0;
        
        for(int i = 0; i < progresses.length; i++){                      
            if((100 - progresses[i]) % speeds[i] != 0){
                progresses[i] = (100 - progresses[i]) / speeds[i] + 1;
            }
            else{
                progresses[i] = (100 - progresses[i]) / speeds[i];
            }             
        }
      
        num = progresses[0];             
        for(int i = 1; i < progresses.length; i++){    
            
            if(num >= progresses[i]) sum++;
            else{
                queue.offer(sum);
                num = progresses[i];
                sum = 1;
            }                
        }queue.add(sum);
      
        int[] answer =  new int[queue.size()];       
        for(int i = 0; i < answer.length; i++)answer[i] = queue.poll();
             
        return answer;
    }
}
