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
        if (correct != 0) correct--;

        answer[0] = 6 - correct - zero_count;
        answer[1] = 6 - correct;

        return answer;
    }
}
