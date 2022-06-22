class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int [] answer = new int [commands.length];
        for (int t = 0; t < commands.length; t ++) {
            int i = commands[t][0];
            int j = commands[t][1];
            int k = commands[t][2];

            i -= 1;
            j -= 1;
            k -= 1;

            int[] result = new int[1 + (j - i)];

            int l = 0;
            for (int num = i; num <= j; num ++) {
                result[l] = array[num];
                l ++;
            }
            int up = 0;
            for (int num1 = 0; num1 < result.length; num1 ++) {
                up = num1;
                for (int num2 = 0; num2 < result.length - up; num2 ++) {
                    if (result[num2] > result[num2 + 1]) {
                        int sw;
                        sw = result[num2];
                        result[num2] = result[num2 + 1];
                        result[num2 + 1] = sw;
                    }
                }

                answer[t]=result[k];
            }

        }
        return answer;
    }
}
