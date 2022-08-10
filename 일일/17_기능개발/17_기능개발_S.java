class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] distribute = new int[progresses.length];
        int index = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                progresses[i] = (100 - progresses[i]) / speeds[i];
            }
            else {
                progresses[i] = (100 - progresses[i]) / speeds[i] + 1;
            }
            //System.out.println(progresses[i]);
        }
        
        int largest = progresses[0];
        
        for (int i = 0; i < progresses.length; i++) {
            if (largest >= progresses[i]) distribute[index]++;
            else {
                index++;
                distribute[index]++;
                largest = progresses[i];
            }
        }

        int[] answer = new int[index+1];

        for (int i = 0; i < index+1; i++) {
            answer[i] = distribute[i];
        }

        return answer;
    }
}


테스트 1 〉	통과 (0.02ms, 73.9MB)
테스트 2 〉	통과 (0.03ms, 71MB)
테스트 3 〉	통과 (0.02ms, 76.3MB)
테스트 4 〉	통과 (0.02ms, 75.2MB)
테스트 5 〉	통과 (0.02ms, 76MB)
테스트 6 〉	통과 (0.02ms, 74MB)
테스트 7 〉	통과 (0.02ms, 77.4MB)
테스트 8 〉	통과 (0.03ms, 74.8MB)
테스트 9 〉	통과 (0.02ms, 70.4MB)
테스트 10 〉	통과 (0.02ms, 66.2MB)
테스트 11 〉	통과 (0.03ms, 84.6MB)
