import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] array_cut = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(array_cut);
            answer[i] = array_cut[commands[i][2]-1];
        }

        return answer;
    }
}

// 최저 속도 0.46ms
