class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] distribute = new int[progresses.length+1];
        int time = 0;
        int index = 0;

        for (int i = 0; i < progresses.length; i++) {
            if (100 > progresses[i] + time * speeds[i]) {
                time += (100 - progresses[i] - speeds[i] * time) / speeds[i];
                if ((100 - progresses[i] - speeds[i] * time) % speeds[i] != 0) time++;
                index++;
                distribute[index]++;
            }
            else {
                distribute[index]++;
            }
        }

        int[] answer = new int[index];

        for (int i = 0; i < index; i++) {
            answer[i] = distribute[i+1];
        }

        return answer;
    }
}



테스트 1 〉	통과 (0.02ms, 73.3MB)
테스트 2 〉	통과 (0.03ms, 77.5MB)
테스트 3 〉	통과 (0.03ms, 72.7MB)
테스트 4 〉	통과 (0.02ms, 78.5MB)
테스트 5 〉	통과 (0.02ms, 73MB)
테스트 6 〉	통과 (0.02ms, 77.7MB)
테스트 7 〉	통과 (0.03ms, 78.2MB)
테스트 8 〉	통과 (0.02ms, 78.1MB)
테스트 9 〉	통과 (0.02ms, 81.2MB)
테스트 10 〉	통과 (0.03ms, 74.2MB)
테스트 11 〉	통과 (0.01ms, 64.4MB)
