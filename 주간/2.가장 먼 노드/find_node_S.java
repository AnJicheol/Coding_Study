class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int[] counts = new int[n];
        int count = 0;
        int target_num = 1;
        boolean full = false;

        while (!full) {  

            for (int i = 0; i < edge.length; i++) {
                int connected_num = 0;
                if (edge[i][0] == target_num) connected_num = edge[i][1] -1;
                else if (edge[i][1] == target_num) connected_num = edge[i][0]-1;
                if (connected_num != 0 && (counts[connected_num] > count || counts[connected_num] == 0))
                    counts[connected_num] = count+1;
            }

            full = true;
            answer = 0;
            for (int i = 1; i < counts.length; i++) {
                if (counts[i] == 0) {
                    full = false;
                    break;
                }
                else if (counts[i] == count+1) answer++;
            }

            int count_tmp = n;
            int target_tmp = target_num;

            for (int i = counts.length-1; i > 0; i--) {  
                if (count != 0 && count == counts[i] && target_num < i + 1) {
                    target_tmp = i + 1;
                    count_tmp = count;
                }
            }
            if (target_num == target_tmp) {
                for (int i = counts.length-1; i > 0; i--) {
                    if (count < counts[i] && count_tmp >= counts[i]) { 
                        count_tmp = counts[i];
                        target_tmp = i + 1;
                    }
                }
            }
            count = count_tmp;
            target_num = target_tmp;

        }

        return answer;
    }
}
