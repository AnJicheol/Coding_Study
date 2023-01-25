import java.util.Stack;

class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        Stack<Integer> del = new Stack<>();
        Stack<Integer> pick = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            del.push(deliveries[i]);
            pick.push(pickups[i]);
        }
        
        while (del.peek() == 0 ) {
            del.pop();
            if(del.empty()) break;
        }
        while (pick.peek() == 0) {
            pick.pop();
            if(pick.empty()) break;
        }
        
        int sum1 = 0;
        int sum2 = 0;
        
        while (!del.empty() || !pick.empty()) {
            
            answer += (del.size() > pick.size()) ? del.size() * 2 : pick.size() * 2;
            //System.out.println(del.size() + " " + pick.size());
            //System.out.println(answer);
            
            if (!del.empty()) {
                sum1 += cap;
                while (sum1 >= del.peek()) {
                    sum1 -= del.pop();
                    if (del.empty()) break;
                }
            }
            if (!pick.empty()) {
                sum2 += cap;
                while (sum2 >= pick.peek()) {
                    sum2 -= pick.pop();
                    if (pick.empty()) break;
                }
            }
            
        }
        
        return answer;
    }
}

테스트 1 〉	통과 (0.27ms, 77.4MB)
테스트 2 〉	통과 (0.19ms, 70.5MB)
테스트 3 〉	통과 (0.30ms, 79MB)
테스트 4 〉	통과 (0.23ms, 73.5MB)
테스트 5 〉	통과 (1.15ms, 80MB)
테스트 6 〉	통과 (0.27ms, 72.8MB)
테스트 7 〉	통과 (2.29ms, 78.3MB)
테스트 8 〉	통과 (4.51ms, 78.9MB)
테스트 9 〉	통과 (8.14ms, 80.9MB)
테스트 10 〉	통과 (6.01ms, 80.8MB)
테스트 11 〉	통과 (3.49ms, 84.5MB)
테스트 12 〉	통과 (4.33ms, 80.6MB)
테스트 13 〉	통과 (2.91ms, 79.8MB)
테스트 14 〉	통과 (5.47ms, 72.3MB)
테스트 15 〉	통과 (32.18ms, 88MB)
테스트 16 〉	통과 (89.83ms, 91.5MB)
테스트 17 〉	통과 (49.22ms, 88MB)
테스트 18 〉	통과 (28.29ms, 87.5MB)
테스트 19 〉	통과 (47.33ms, 86.8MB)
테스트 20 〉	통과 (34.82ms, 87.5MB)
