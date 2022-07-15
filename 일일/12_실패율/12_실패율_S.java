import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        float[] percent = new float[N];
        int count = 0;
        float tmp;
        int tmp_2;
        
        
        for (int i : stages) { //스테이지 별 막힌 인원 수 구하기
            if (i != N+1) answer[i-1] += 1;
        }
        
        for (int i = 0; i < answer.length; i++) { //실패율 구하기
            percent[i] = (float) answer[i] / (stages.length - count);
            count += answer[i];
            answer[i] = i+1;
            //System.out.println(percent[i]);
        }
        
        for (int i = 0; i < N; i++) {  //정렬
            for (int j = 1; j < N - i; j++) {
                if (percent[j] > percent[j-1]) {
                    tmp = percent[j-1];
                    percent[j-1] = percent[j];
                    percent[j] = tmp;
                    tmp_2 = answer[j-1];
                    answer[j-1] = answer[j];
                    answer[j] = tmp_2;
                }
            }
            
        }
        
        return answer;
    }
}


테스트 1 〉	통과 (0.02ms, 74.2MB)
테스트 2 〉	통과 (0.05ms, 75MB)
테스트 3 〉	통과 (4.48ms, 78.3MB)
테스트 4 〉	통과 (2.39ms, 91.1MB)
테스트 5 〉	통과 (4.13ms, 95.7MB)
테스트 6 〉	통과 (0.19ms, 74.5MB)
테스트 7 〉	통과 (0.48ms, 76.8MB)
테스트 8 〉	통과 (2.45ms, 88.1MB)
테스트 9 〉	통과 (3.89ms, 87.8MB)
테스트 10 〉	통과 (2.21ms, 82MB)
테스트 11 〉	통과 (2.37ms, 87.7MB)
테스트 12 〉	통과 (2.78ms, 84.1MB)
테스트 13 〉	통과 (3.06ms, 84MB)
테스트 14 〉	통과 (0.02ms, 73.9MB)
테스트 15 〉	통과 (1.68ms, 80.5MB)
테스트 16 〉	통과 (0.88ms, 76.6MB)
테스트 17 〉	통과 (1.64ms, 80.1MB)
테스트 18 〉	통과 (0.83ms, 78.6MB)
테스트 19 〉	통과 (0.20ms, 77.8MB)
테스트 20 〉	통과 (1.19ms, 77.3MB)
테스트 21 〉	통과 (2.21ms, 81.7MB)
테스트 22 〉	통과 (3.85ms, 94.7MB)
테스트 23 〉	통과 (3.09ms, 98.5MB)
테스트 24 〉	통과 (3.11ms, 92.7MB)
테스트 25 〉	통과 (0.02ms, 78.3MB)
테스트 26 〉	통과 (0.02ms, 71.4MB)
테스트 27 〉	통과 (0.01ms, 75MB)
