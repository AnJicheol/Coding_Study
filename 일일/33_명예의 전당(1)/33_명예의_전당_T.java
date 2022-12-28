import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];
        PriorityQueue<Integer> qu = new PriorityQueue<>(); 

        for (int i = 0; i < score.length; i++) {
            qu.add(score[i]);
            if (qu.size() > k) qu.poll();

            answer[i] = qu.peek();
        }

        return answer;
    }
}
