import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int num = 0;
        PriorityQueue<Integer> scoville_h = new PriorityQueue<>();
        
        for(int i = 0; i<scoville.length; i++){ 
            scoville_h.add(scoville[i]);
        }
        //System.out.println(scoville_h);
        
        for(int answer = 1; answer < scoville.length; answer++){ 
            num = scoville_h.poll();
            num += (scoville_h.poll()*2);
            
            scoville_h.add(num);
            if(scoville_h.peek() >= K) {return answer;}
        }      
        
        return -1;
    }
}

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
정확성  테스트
테스트 1 〉	통과 (0.40ms, 80.3MB)
테스트 2 〉	통과 (0.32ms, 74.4MB)
테스트 3 〉	통과 (0.42ms, 70.3MB)
테스트 4 〉	통과 (0.34ms, 65.5MB)
테스트 5 〉	통과 (0.43ms, 71.5MB)
테스트 6 〉	통과 (1.60ms, 69MB)
테스트 7 〉	통과 (2.12ms, 78.6MB)
테스트 8 〉	통과 (0.64ms, 82.6MB)
테스트 9 〉	통과 (0.73ms, 70.8MB)
테스트 10 〉	통과 (1.66ms, 88.4MB)
테스트 11 〉	통과 (1.32ms, 76.6MB)
테스트 12 〉	통과 (3.22ms, 77.8MB)
테스트 13 〉	통과 (1.73ms, 75.3MB)
테스트 14 〉	통과 (0.37ms, 76.4MB)
테스트 15 〉	통과 (1.69ms, 75MB)
테스트 16 〉	통과 (0.43ms, 83.9MB)
효율성  테스트
테스트 1 〉	통과 (151.56ms, 69.4MB)
테스트 2 〉	통과 (254.66ms, 87.3MB)
테스트 3 〉	통과 (1536.86ms, 122MB)
테스트 4 〉	통과 (130.09ms, 65.4MB)
테스트 5 〉	통과 (1607.16ms, 126MB)
