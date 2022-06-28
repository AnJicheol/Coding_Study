@@@@@@@@@@@@@@@@@@@재귀 이용한 풀이@@@@@@@@@@@@@@@@@@@@@@@
class Solution {
    int[][] com;
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        com = computers;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                check_com(i);
            }
        }
        return answer;
    }
    
    void check_com(int num) {
        for (int i = 0; i < com.length; i++) {
            if (com[num][i] == 1 && !visited[i]) {
                visited[i] = true;
                check_com(i);
            }
        }
    }
}

테스트 1 〉	통과 (0.02ms, 74.9MB)
테스트 2 〉	통과 (0.02ms, 74.7MB)
테스트 3 〉	통과 (0.04ms, 75.1MB)
테스트 4 〉	통과 (0.03ms, 85.2MB)
테스트 5 〉	통과 (0.02ms, 75MB)
테스트 6 〉	통과 (0.07ms, 75.4MB)
테스트 7 〉	통과 (0.02ms, 74.4MB)
테스트 8 〉	통과 (0.06ms, 76.5MB)
테스트 9 〉	통과 (0.05ms, 72.3MB)
테스트 10 〉	통과 (0.04ms, 77.8MB)
테스트 11 〉	통과 (0.19ms, 75.4MB)
테스트 12 〉	통과 (0.15ms, 78.5MB)
테스트 13 〉	통과 (0.09ms, 75.9MB)
  
  
@@@@@@@@@@@@@@@ 스택을 이용한 풀이 (너무 느림 피드백 필요) @@@@@@@@@@@@@@@
  
  public int solution(int n, int[][] computers) {
        int answer = 0;
        Stack<Integer> stack = new Stack();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                stack.push(i);
                visited[i] = true;

                for (int j = 0; j < n; j++) {
                    if (stack.isEmpty()) break;
                    else if (computers[stack.peek()][j] == 1 && !visited[j]) {
                        stack.push(j);
                        visited[j] = true;
                        j = -1;
                    } else if (j == n-1 ) {
                        stack.pop();
                        j = -1;
                    }
                }
            }
        }
        return answer;
    }
  
  
테스트 1 〉	통과 (0.13ms, 74.5MB)
테스트 2 〉	통과 (0.19ms, 76MB)
테스트 3 〉	통과 (0.36ms, 72.4MB)
테스트 4 〉	통과 (0.41ms, 78.7MB)
테스트 5 〉	통과 (0.11ms, 75.8MB)
테스트 6 〉	통과 (0.87ms, 75.3MB)
테스트 7 〉	통과 (0.17ms, 79MB)
테스트 8 〉	통과 (0.72ms, 79.4MB)
테스트 9 〉	통과 (0.79ms, 77.8MB)
테스트 10 〉	통과 (0.70ms, 72.8MB)
테스트 11 〉	통과 (2.20ms, 82.2MB)
테스트 12 〉	통과 (2.18ms, 76.3MB)
테스트 13 〉	통과 (0.98ms, 77.1MB)
