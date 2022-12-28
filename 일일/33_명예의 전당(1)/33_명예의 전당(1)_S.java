import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            queue.add(score[i]);
            while (queue.size() > k) {
                queue.poll();
            }

            answer[i] = queue.peek();
        }

        return answer;
    }
}

테스트 1 〉	통과 (0.36ms, 79.6MB)
테스트 2 〉	통과 (0.96ms, 74.2MB)
테스트 3 〉	통과 (0.46ms, 80.2MB)
테스트 4 〉	통과 (0.32ms, 74.6MB)
테스트 5 〉	통과 (0.35ms, 77.4MB)
테스트 6 〉	통과 (0.42ms, 72.6MB)
테스트 7 〉	통과 (0.38ms, 79.6MB)
테스트 8 〉	통과 (0.36ms, 74.4MB)
테스트 9 〉	통과 (0.48ms, 77.2MB)
테스트 10 〉	통과 (0.45ms, 73.8MB)
테스트 11 〉	통과 (0.35ms, 77.6MB)
테스트 12 〉	통과 (1.14ms, 74.5MB)
테스트 13 〉	통과 (1.41ms, 77.2MB)
테스트 14 〉	통과 (1.38ms, 82.3MB)
테스트 15 〉	통과 (1.45ms, 68.6MB)
테스트 16 〉	통과 (1.78ms, 73.8MB)
테스트 17 〉	통과 (1.78ms, 74.8MB)
테스트 18 〉	통과 (2.46ms, 80.2MB)
테스트 19 〉	통과 (1.91ms, 80.9MB)
테스트 20 〉	통과 (1.59ms, 72.9MB)
테스트 21 〉	통과 (1.72ms, 69.2MB)
테스트 22 〉	통과 (1.52ms, 77.5MB)
테스트 23 〉	통과 (1.35ms, 77.9MB)
테스트 24 〉	통과 (1.53ms, 76.6MB)
테스트 25 〉	통과 (1.41ms, 83.6MB)
테스트 26 〉	통과 (0.29ms, 66.6MB)
