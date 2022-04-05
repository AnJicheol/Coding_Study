import java.util.HashSet;
import java.util.Set;

class Solution {
    
    int[] score = {6, 6, 5, 4, 3, 2, 1};
    
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[2];
        int len, zero = 0, min;
               
        for(int i = 0; i < 6; i++){
            set.add(lottos[i]);
        } 
        
        len = set.size();
        if(set.contains(0))zero = 7 - len;;
        
        for(int i = 0; i < 6; i++){
            set.add(win_nums[i]);
        }
        
        min =  6 - (set.size() - len);
        answer[0] = score[min + zero];
        answer[1] = score[min];
        
        return answer;
    }
}
//이렇게도 풀 수 있다는 것만 참고하셈  성능 은 2중  for문으로 서치하는게 모든 알고리즘 중 제일 빠를거임
