import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        float[] percent = new float[N];
        float tmp1 = 0;
        int tmp2 = 0;

        for (int num : stages) {
            if (num != N+1) answer[num-1] += 1;
        }

        for (int i = 0; i < N; i++) {
            percent[i] = (float) answer[i] / (stages.length - tmp1);
            if (Float.isNaN(percent[i])) percent[i] = 0;
            tmp1 += answer[i];
            answer[i] = i+1;
        }


        //System.out.println(Arrays.toString(percent));

        merge_sort(answer, percent, 0, N);

        return answer;
    }
    
    private void merge_sort(int[] answer, float[] percent, int left, int right) {
        int mid = (left+right) / 2;

        if (left < mid) {
            merge_sort(answer, percent, left, mid);
            merge_sort(answer, percent, mid, right);
            merge(answer, percent, left, right);
            //System.out.println(Arrays.toString(percent));
        }




    }

    private void merge(int[] answer, float[] percent, int left, int right) {
        int[] ans = new int[right - left];
        float[] per = new float[right - left];
        int mid = (left+right)/2;
        int index = 0;
        int a_i = left;
        int b_i = mid;

        //System.out.println("left " + left + " right " + right);
        //System.out.println("ai " + a_i + " bi " + b_i);

        while (a_i < mid && b_i < right) {
            if (percent[a_i] >= percent[b_i]) {
                ans[index] = answer[a_i];
                per[index] = percent[a_i];
                index++;
                a_i++;
            } else {
                ans[index] = answer[b_i];
                per[index] = percent[b_i];
                index++;
                b_i++;
            }
        }

        //System.out.println(Arrays.toString(ans));
        //System.out.println(Arrays.toString(per));

        if (a_i < mid) {
            for (int i = a_i; i < mid; i++) {
                ans[index] = answer[i];
                per[index] = percent[i];
                index++;
            }
        } else if (b_i < right) {
            for (int i = b_i; i < right; i++) {
                ans[index] = answer[i];
                per[index] = percent[i];
                index++;
            }
        }

        a_i = 0;

        for (int i = left; i < right; i++) {
            answer[i] = ans[a_i];
            percent[i] = per[a_i];
            a_i++;
        }


    }

}


테스트 1 〉	통과 (0.05ms, 73.9MB)
테스트 2 〉	통과 (0.06ms, 76.3MB)
테스트 3 〉	통과 (1.04ms, 78.7MB)
테스트 4 〉	통과 (2.50ms, 87.1MB)
테스트 5 〉	통과 (4.88ms, 84.8MB)
테스트 6 〉	통과 (0.17ms, 75.9MB)
테스트 7 〉	통과 (0.48ms, 72.9MB)
테스트 8 〉	통과 (3.73ms, 77.8MB)
테스트 9 〉	통과 (3.71ms, 104MB)
테스트 10 〉	통과 (3.85ms, 84MB)
테스트 11 〉	통과 (2.88ms, 91.3MB)
테스트 12 〉	통과 (4.36ms, 91.3MB)
테스트 13 〉	통과 (3.34ms, 89.9MB)
테스트 14 〉	통과 (0.08ms, 73.8MB)
테스트 15 〉	통과 (1.97ms, 87.5MB)
테스트 16 〉	통과 (0.88ms, 76.5MB)
테스트 17 〉	통과 (1.77ms, 87.6MB)
테스트 18 〉	통과 (0.99ms, 79.3MB)
테스트 19 〉	통과 (0.30ms, 71.6MB)
테스트 20 〉	통과 (1.20ms, 78.8MB)
테스트 21 〉	통과 (2.23ms, 87.9MB)
테스트 22 〉	통과 (4.73ms, 86.1MB)
테스트 23 〉	통과 (3.05ms, 93MB)
테스트 24 〉	통과 (3.95ms, 82.8MB)
테스트 25 〉	통과 (0.04ms, 72.7MB)
테스트 26 〉	통과 (0.04ms, 79.3MB)
테스트 27 〉	통과 (0.05ms, 73.2MB)
