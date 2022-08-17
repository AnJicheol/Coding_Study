class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[][] students = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        int[] score = new int[3];
        int index;
        
        for (int i = 0; i < answers.length; i++) {
            
            for (int j = 0; j < students.length; j++) {
                index = i % students[j].length;
                //System.out.println("index = "+index);
                if (students[j][index] == answers[i]) {
                    score[j]++;
                }
            }
        }
        
        int same = 0;
        int large = 0;
        
        for (int i = 0; i < score.length; i++) {
            if (large < score[i]) large = score[i];
        }
        
        for (int i = 0; i < score.length; i++) {
            if (large == score[i]) same++;
        }
        
        answer = new int[same];
        index = 0;
        
        for (int i = 0; i < score.length; i++) {
            if (score[i] == large) {
                answer[index] = i+1;
                index++;
            }
        }
        
        return answer;
    }
}

테스트 1 〉	통과 (0.02ms, 76MB)
테스트 2 〉	통과 (0.03ms, 75.9MB)
테스트 3 〉	통과 (0.02ms, 65.9MB)
테스트 4 〉	통과 (0.03ms, 73.8MB)
테스트 5 〉	통과 (0.05ms, 73.4MB)
테스트 6 〉	통과 (0.04ms, 75.3MB)
테스트 7 〉	통과 (0.53ms, 76.6MB)
테스트 8 〉	통과 (0.19ms, 74.7MB)
테스트 9 〉	통과 (1.66ms, 82.1MB)
테스트 10 〉	통과 (0.45ms, 72.4MB)
테스트 11 〉	통과 (1.83ms, 78.6MB)
테스트 12 〉	통과 (0.97ms, 75.3MB)
테스트 13 〉	통과 (0.08ms, 77.8MB)
테스트 14 〉	통과 (1.80ms, 79.5MB)
