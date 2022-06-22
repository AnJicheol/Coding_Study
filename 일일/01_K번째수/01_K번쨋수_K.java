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


//
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 피드백 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
안지철
[22번줄에 정렬 알고리즘 버블 정렬 알고리즘임
해당 알고리즘은 이미 정렬된 곳도 if문으로 비교하기 때문에 
비효율적인 다른 방법으로 개선 필요해보임]

송정훈
[정렬 부분에서 비효율적인 부분이 있고,
코드를 줄일 수 있는 부분이 보인다.
하지만 코드를 이해하기 쉽게 잘 짜줘서
그 점은 좋다고 생각한다. :)]
