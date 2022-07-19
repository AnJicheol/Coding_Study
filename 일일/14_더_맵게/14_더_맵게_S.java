import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int sum;
        PriorityQueue<Integer> queue = new PriorityQueue();

        for (int amount : scoville) {
            queue.add(amount);
        }

        while (queue.peek() < K) {
            if (queue.size() < 2) return -1;
            sum = queue.poll() + (queue.poll() * 2);
            queue.add(sum);
            answer++;
        }

        return answer;
    }
}


정확성  테스트
테스트 1 〉	통과 (0.31ms, 76.5MB)
테스트 2 〉	통과 (0.31ms, 74.8MB)
테스트 3 〉	통과 (0.33ms, 73.5MB)
테스트 4 〉	통과 (0.29ms, 72.9MB)
테스트 5 〉	통과 (0.28ms, 73.8MB)
테스트 6 〉	통과 (1.80ms, 77.2MB)
테스트 7 〉	통과 (1.69ms, 77.3MB)
테스트 8 〉	통과 (0.68ms, 82.7MB)
테스트 9 〉	통과 (0.87ms, 81.6MB)
테스트 10 〉	통과 (1.42ms, 76MB)
테스트 11 〉	통과 (1.13ms, 78.2MB)
테스트 12 〉	통과 (2.13ms, 76.9MB)
테스트 13 〉	통과 (1.69ms, 77.7MB)
테스트 14 〉	통과 (0.35ms, 73MB)
테스트 15 〉	통과 (1.91ms, 72MB)
테스트 16 〉	통과 (0.35ms, 76.7MB)
효율성  테스트
테스트 1 〉	통과 (140.22ms, 65.8MB)
테스트 2 〉	통과 (260.58ms, 86.4MB)
테스트 3 〉	통과 (1522.89ms, 123MB)
테스트 4 〉	통과 (118.46ms, 64.2MB)
테스트 5 〉	통과 (1398.91ms, 123MB)
