import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        float[] percent = new float[N];
        int count = 0;
        int stage_tmp;
        float percent_tmp;
        
        for (int i : stages) { //스테이지 별 막힌 인원 수 구하기
            if (i != N+1) answer[i-1] += 1;
        }
        
        for (int i = 0; i < answer.length; i++) { //실패율 구하기
            percent[i] = (float) answer[i] / (stages.length - count);
            count += answer[i];
            answer[i] = i+1;
            //System.out.println(percent[i]);
        }
        
        int j = 0;
        
        for (int i = 1; i < N; i++) {
            stage_tmp = answer[i];
            percent_tmp = percent[i];
            for (j = i - 1; j >= 0; j--) {
                if (percent_tmp > percent[j]) {
                    percent[j+1] = percent[j];
                    answer[j+1] = answer[j]; 
                } else break;
            }
            percent[j+1] = percent_tmp;
            answer[j+1] = stage_tmp;
            //System.out.println(Arrays.toString(answer));
        }
        
        return answer;
    }
}


테스트 1 〉	통과 (0.02ms, 78.5MB)
테스트 2 〉	통과 (0.05ms, 76.5MB)
테스트 3 〉	통과 (2.68ms, 81.7MB)
테스트 4 〉	통과 (2.46ms, 97.4MB)
테스트 5 〉	통과 (3.77ms, 96.7MB)
테스트 6 〉	통과 (0.08ms, 74.1MB)
테스트 7 〉	통과 (0.35ms, 78.9MB)
테스트 8 〉	통과 (3.75ms, 88.7MB)
테스트 9 〉	통과 (4.50ms, 97.2MB)
테스트 10 〉	통과 (2.21ms, 87.3MB)
테스트 11 〉	통과 (2.23ms, 91MB)
테스트 12 〉	통과 (2.61ms, 89.1MB)
테스트 13 〉	통과 (2.95ms, 82.3MB)
테스트 14 〉	통과 (0.02ms, 75.9MB)
테스트 15 〉	통과 (1.70ms, 81.3MB)
테스트 16 〉	통과 (0.83ms, 82.2MB)
테스트 17 〉	통과 (1.69ms, 80.8MB)
테스트 18 〉	통과 (1.01ms, 74MB)
테스트 19 〉	통과 (0.18ms, 78.9MB)
테스트 20 〉	통과 (1.19ms, 78.7MB)
테스트 21 〉	통과 (2.21ms, 82.6MB)
테스트 22 〉	통과 (3.90ms, 96.8MB)
테스트 23 〉	통과 (3.91ms, 91.5MB)
테스트 24 〉	통과 (3.14ms, 85.3MB)
테스트 25 〉	통과 (0.02ms, 74.2MB)
테스트 26 〉	통과 (0.01ms, 76.4MB)
테스트 27 〉	통과 (0.02ms, 66.8MB)
