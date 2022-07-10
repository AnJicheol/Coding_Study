import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correct = 0;
        int zero_count = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero_count++;
            } else {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) correct++;
                }
            }
        }

        if (zero_count != 0 && correct == 0) zero_count--;
        eles if (correct != 0) correct--;
        
        answer[0] = 6 - correct - zero_count;
        answer[1] = 6 - correct;

        return answer;
    }
}

테스트 1 〉	통과 (0.01ms, 72.3MB)
테스트 2 〉	통과 (0.01ms, 73MB)
테스트 3 〉	통과 (0.02ms, 74.8MB)
테스트 4 〉	통과 (0.02ms, 77.4MB)
테스트 5 〉	통과 (0.02ms, 78.4MB)
테스트 6 〉	통과 (0.02ms, 76.1MB)
테스트 7 〉	통과 (0.02ms, 76.8MB)
테스트 8 〉	통과 (0.02ms, 72.6MB)
테스트 9 〉	통과 (0.01ms, 77.6MB)
테스트 10 〉통과 (0.02ms, 73.8MB)
테스트 11 〉통과 (0.01ms, 82.2MB)
테스트 12 〉통과 (0.01ms, 73.8MB)
테스트 13 〉통과 (0.01ms, 75.9MB)
테스트 14 〉통과 (0.01ms, 75.5MB)
테스트 15 〉통과 (0.01ms, 72.9MB)
    
    
    
    
    
    
