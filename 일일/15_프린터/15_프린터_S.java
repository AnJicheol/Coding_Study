import java.util.Arrays;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int index = -1;
        int[] sort = priorities.clone();

        Arrays.sort(sort);

        for(int i = sort.length-1 ; i >= 0 ; i--){
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


테스트 1 〉	통과 (0.38ms, 70.6MB)
테스트 2 〉	통과 (0.35ms, 75.2MB)
테스트 3 〉	통과 (0.33ms, 72.3MB)
테스트 4 〉	통과 (0.34ms, 73.1MB)
테스트 5 〉	통과 (0.31ms, 75.5MB)
테스트 6 〉	통과 (0.47ms, 76.8MB)
테스트 7 〉	통과 (0.35ms, 71.7MB)
테스트 8 〉	통과 (0.38ms, 76MB)
테스트 9 〉	통과 (0.33ms, 75.1MB)
테스트 10 〉	통과 (0.42ms, 75MB)
테스트 11 〉	통과 (0.51ms, 82.4MB)
테스트 12 〉	통과 (0.47ms, 83.2MB)
테스트 13 〉	통과 (0.51ms, 80.3MB)
테스트 14 〉	통과 (0.32ms, 72.6MB)
테스트 15 〉	통과 (0.35ms, 73.3MB)
테스트 16 〉	통과 (0.37ms, 78MB)
테스트 17 〉	통과 (0.37ms, 77.8MB)
테스트 18 〉	통과 (0.37ms, 79.9MB)
테스트 19 〉	통과 (0.42ms, 70.7MB)
테스트 20 〉	통과 (0.37ms, 87.5MB)
