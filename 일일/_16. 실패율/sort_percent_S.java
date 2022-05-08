import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] per = new double[N][2];
        double total = stages.length;
        for (int i = 1; i < N+1.0; i++) {
            double count = 0.0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    count++;
                }
            }
            per[i-1][0] = count / total;
            per[i-1][1] = i;
            total -= count;
        }


        for (int i = 0; i < per.length; i++) {
            double Highest_percent = per[i][0];
            double stage = per[i][1];
            for (int j = i+1; j < per.length; j++) {
                if (Highest_percent < per[j][0]) {
                    double percent_tmp = per[j][0];
                    per[j][0] = Highest_percent;
                    Highest_percent = percent_tmp;
                    double stage_tmp = stage;
                    stage = per[j][1];
                    per[j][1] = stage_tmp;
                } else if (Highest_percent == per[j][0] && stage > per[j][1]) {
                    double stage_tmp = stage;
                    stage = per[j][1];
                    per[j][1] = stage_tmp;
                }
            }
            answer[i] = (int)stage;
        }
        
        return answer;
    }
}
