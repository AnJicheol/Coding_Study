class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n + 1];
        int answer = n;

        for (int num : reserve) student[num]++;
        for (int num : lost)    student[num]--;
 
        for (int i = 1; i < student.length - 1; i++) {
            if(student[i] == -1) {
                if(i - 1 >= 0 && student[i-1] == 1) {
                    student[i-1]--;
                    student[i]++;
                    continue;
                }
                if(i + 1 < student.length && student[i+1] == 1) {
                    student[i+1]--;
                    student[i]++;
                    continue;
                } 
                answer--;
            }
        }
        return answer;
    }
}
