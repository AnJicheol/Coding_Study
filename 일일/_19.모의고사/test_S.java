class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        int highest = 0;
        int same = 0;
        for (int i = 0; i < answers.length; i++) {
            int loop = i % student1.length;
            if (student1[loop] == answers[i]) {
                score[0]++;
                if (score[0] > highest) highest = score[0];
            }
            loop = i % student2.length;
            if (student2[loop] == answers[i]) {
                score[1]++;
                if (score[1] > highest) highest = score[1];
                
            }
            loop = i % student3.length;
            if (student3[loop] == answers[i]) {
                score[2]++;
                if (score[2] > highest) highest = score[2];
            }

        }
        for (int i = 0; i < 3; i++) {
            if (highest == score[i]) same++;
        }
        answer = new int[same];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if (score[i] == highest) {
                answer[index] = i+1;
                index++;
            }
        }

        return answer;
    }
}
