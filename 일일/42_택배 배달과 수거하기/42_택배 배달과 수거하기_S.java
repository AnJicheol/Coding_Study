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
            answer += del.size();
            
            answer += (del.size() > pick.size()) ? del.size() : (pick.size()*2 - del.size());
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

테스트 1 〉	통과 (0.20ms, 79.2MB)
테스트 2 〉	통과 (0.25ms, 76.3MB)
테스트 3 〉	통과 (0.34ms, 77.2MB)
테스트 4 〉	통과 (0.38ms, 79.5MB)
테스트 5 〉	통과 (0.42ms, 75MB)
테스트 6 〉	통과 (0.78ms, 67.7MB)
테스트 7 〉	통과 (4.35ms, 79MB)
테스트 8 〉	통과 (2.28ms, 78.6MB)
테스트 9 〉	통과 (5.88ms, 74.8MB)
테스트 10 〉	통과 (6.49ms, 78.9MB)
테스트 11 〉	통과 (3.89ms, 70.2MB)
테스트 12 〉	통과 (4.20ms, 80.6MB)
테스트 13 〉	통과 (5.64ms, 72.4MB)
테스트 14 〉	통과 (3.57ms, 83.1MB)
테스트 15 〉	통과 (28.30ms, 104MB)
테스트 16 〉	통과 (101.72ms, 90.9MB)
테스트 17 〉	통과 (41.21ms, 102MB)
테스트 18 〉	통과 (34.51ms, 98.4MB)
테스트 19 〉	통과 (29.51ms, 97.1MB)
테스트 20 〉	통과 (27.94ms, 99.9MB)
