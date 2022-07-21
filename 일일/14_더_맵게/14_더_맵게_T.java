import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;       
        PriorityQueue<Integer> heap = new PriorityQueue();
        
        for(Integer num : scoville)heap.add(num);
        
        while (heap.peek() < K){
            if (heap.size() < 2) return -1;
            heap.add(heap.poll() + (heap.poll() * 2));
            answer++;
        }
        
        return answer;
    }
}
