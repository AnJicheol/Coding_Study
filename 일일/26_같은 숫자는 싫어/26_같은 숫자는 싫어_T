import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> qu = new ArrayDeque<>(arr.length);

        qu.offer(arr[0]);

        for(Integer i : arr){
            if(qu.peekLast() != i) qu.offer(i);
        }
        int[] answer = new int[qu.size()]; 

        for(int i = 0; i < answer.length; i++){
            answer[i] = qu.poll();
        }
        return answer;
    }
}
