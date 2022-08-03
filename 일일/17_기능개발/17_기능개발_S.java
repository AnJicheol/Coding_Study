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

    
    class Solution {
    
    public int[] solution(int[] progresses, int[] speeds) {
        int[] distribute = new int[progresses.length];
        int time = 0;
        int index = 0;
        int j = 0;
        
        while (index < progresses.length){
            time += (100 - progresses[index] - speeds[index] * time) / speeds[index];
            if ((100 - progresses[index] - speeds[index] * time) % speeds[index] != 0) time++;
            distribute[j] = check_progress(progresses, speeds, time, index, 0);
            index += distribute[j];
            j++;
        }

        int[] answer = new int[j];

        for (int i = 0; i < j; i++) answer[i] = distribute[i];
        
        return answer;

    }

    int check_progress(int[] progress, int[] speed, int time, int index, int finished) {

        if (index == progress.length || progress[index] + speed[index] * time < 100) return finished;
        finished++;
        return check_progress(progress, speed, time, index+1, finished);

    }
}

테스트 1 〉	통과 (0.02ms, 76.7MB)
테스트 2 〉	통과 (0.02ms, 79MB)
테스트 3 〉	통과 (0.02ms, 74.5MB)
테스트 4 〉	통과 (0.02ms, 83.4MB)
테스트 5 〉	통과 (0.02ms, 73.8MB)
테스트 6 〉	통과 (0.02ms, 76.1MB)
테스트 7 〉	통과 (0.02ms, 73.5MB)
테스트 8 〉	통과 (0.01ms, 75.6MB)
테스트 9 〉	통과 (0.02ms, 75.1MB)
테스트 10 〉	통과 (0.04ms, 77.4MB)
테스트 11 〉	통과 (0.02ms, 76.2MB)
