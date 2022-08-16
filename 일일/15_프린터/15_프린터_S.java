import java.util.Arrays;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int index = -1;
        int[] sort = priorities.clone();
        int tmp;

        for (int i = 1; i < sort.length; i++) {
            tmp = sort[i];
            int j;
            for (j = i; j > 0; j--) {
                if (tmp > sort[j-1]) {
                    sort[j] = sort[j-1];
                }
                else {
                    break;
                }
            }
            sort[j] = tmp;
            //System.out.println(Arrays.toString(sort));
        }
        

        for(int i = 0; i < sort.length ; i++) {
            for (int j = 0; j < priorities.length; j++) {
                index++;
                if (index == priorities.length) index = 0;

                if (priorities[index] == sort[i]) {
                    answer++;
                    break;
                }

            }
            if (index == location) break;
        }
        return answer;
    }
}

테스트 1 〉	통과 (0.03ms, 76MB)
테스트 2 〉	통과 (0.16ms, 74.7MB)
테스트 3 〉	통과 (0.09ms, 75MB)
테스트 4 〉	통과 (0.04ms, 69.3MB)
테스트 5 〉	통과 (0.03ms, 66.7MB)
테스트 6 〉	통과 (0.04ms, 71.6MB)
테스트 7 〉	통과 (0.06ms, 69.7MB)
테스트 8 〉	통과 (0.08ms, 75.8MB)
테스트 9 〉	통과 (0.02ms, 73.8MB)
테스트 10 〉	통과 (0.04ms, 73.2MB)
테스트 11 〉	통과 (0.09ms, 76MB)
테스트 12 〉	통과 (0.03ms, 70.5MB)
테스트 13 〉	통과 (0.09ms, 77.3MB)
테스트 14 〉	통과 (0.03ms, 75.2MB)
테스트 15 〉	통과 (0.03ms, 76.4MB)
테스트 16 〉	통과 (0.03ms, 67.2MB)
테스트 17 〉	통과 (0.13ms, 70.1MB)
테스트 18 〉	통과 (0.04ms, 77.6MB)
테스트 19 〉	통과 (0.13ms, 65.7MB)
테스트 20 〉	통과 (0.08ms, 76.5MB)
