################################## 우선순위 큐 풀이 ############################################

import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> PRI = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for(int num : priorities) PRI.offer(num);

        while(!PRI.isEmpty()){
            for(int i = 0;i<priorities.length;i++){
                if(PRI.peek() == priorities[i] ){
                    PRI.poll();
                    answer++;
                    if(location == i ) return answer;
                }
            }
        }
        return answer;
    }
}

#############################################################################################
안지철[
해당 문제는 솔트를 사용해서 풀어보라고 규칙을 걸었는데 그 이유는 
알고리즘에 최적화를 통해 자료구조를 사용하지 않아도 같은 알고리즘이
나올 수 있다는 것을 보여주기 위함이였으며 또 각자 우선순위 큐를 정말
이해하고 있는지 확인하기 위해서 였음]
