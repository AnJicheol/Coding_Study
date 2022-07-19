import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0; // 스코빌 지수를 담을 변수
       
        PriorityQueue<Integer> scovilleHeap = new PriorityQueue<>();
        
        for(int i = 0; i<scoville.length; i++){ 
            scovilleHeap.offer(scoville[i]); // offer = 힙에 값 추가
        }
        
        for(int i = 1; i<scoville.length; i++){ 
            answer = scovilleHeap.poll()+(scovilleHeap.poll()*2); // poll = 첫 번째 출력 후 삭제
            scovilleHeap.offer(answer); 
            
            if(scovilleHeap.peek()>K) return i; // peek = 첫 번째 출력
            
        }            
        
        return -1; // 모든 경우가 K보다 작을 때
    }
}


테스트 1 〉	통과 (0.29ms, 81.6MB)
테스트 2 〉	통과 (0.29ms, 78MB)
테스트 3 〉	통과 (0.32ms, 70.7MB)
테스트 4 〉	통과 (0.31ms, 77.1MB)
테스트 5 〉	통과 (0.31ms, 75.1MB)
테스트 6 〉	통과 (1.95ms, 72.1MB)
테스트 7 〉	통과 (1.48ms, 78.3MB)
테스트 8 〉	통과 (0.73ms, 77MB)
테스트 9 〉	통과 (0.81ms, 68.2MB)
테스트 10 〉	통과 (1.44ms, 73.4MB)
테스트 11 〉	통과 (1.13ms, 75.6MB)
테스트 12 〉	통과 (2.14ms, 66.3MB)
테스트 13 〉	통과 (1.60ms, 75.6MB)
테스트 14 〉	통과 (0.40ms, 76.9MB)
테스트 15 〉	통과 (1.75ms, 81MB)
테스트 16 〉	통과 (0.29ms, 74.8MB)
효율성  테스트
테스트 1 〉	통과 (172.36ms, 66.7MB)
테스트 2 〉	통과 (305.14ms, 104MB)
테스트 3 〉	통과 (1442.77ms, 122MB)
테스트 4 〉	통과 (154.38ms, 66.8MB)
테스트 5 〉	통과 (1687.46ms, 127MB)
