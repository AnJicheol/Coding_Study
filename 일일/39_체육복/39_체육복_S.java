import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> set = new HashSet<Integer>();
        int answer=n-lost.length;
        
        for(int num : reserve) {
            set.add(num);
        }
        
        for(int i =0;i<lost.length;i++) {
            if(set.contains(lost[i])) {
                answer++;
                set.remove(lost[i]);
                lost[i]=-1;
            }
        }

        Arrays.sort(lost);
        
        for(int i =0;i<lost.length;i++) {

            if(set.contains(lost[i]-1)) {
                set.remove(lost[i]-1);
                answer++;
            }else if(set.contains(lost[i]+1)) {
                set.remove(lost[i]+1);
                answer++;
            }
        }


        return answer;
    }
}

테스트 1 〉	통과 (0.48ms, 87.8MB)
테스트 2 〉	통과 (0.56ms, 76.4MB)
테스트 3 〉	통과 (0.43ms, 78.1MB)
테스트 4 〉	통과 (0.53ms, 74.8MB)
테스트 5 〉	통과 (0.54ms, 75.1MB)
테스트 6 〉	통과 (0.58ms, 66.1MB)
테스트 7 〉	통과 (0.55ms, 70.7MB)
테스트 8 〉	통과 (0.36ms, 76.7MB)
테스트 9 〉	통과 (0.49ms, 80.9MB)
테스트 10 〉	통과 (0.39ms, 71MB)
테스트 11 〉	통과 (0.36ms, 78.2MB)
테스트 12 〉	통과 (0.37ms, 73.6MB)
테스트 13 〉	통과 (0.42ms, 80.9MB)
테스트 14 〉	통과 (0.33ms, 76.4MB)
테스트 15 〉	통과 (0.37ms, 77.1MB)
테스트 16 〉	통과 (0.43ms, 77.6MB)
테스트 17 〉	통과 (0.35ms, 77.3MB)
테스트 18 〉	통과 (0.37ms, 75.8MB)
테스트 19 〉	통과 (0.35ms, 74.8MB)
테스트 20 〉	통과 (0.37ms, 76.1MB)
테스트 21 〉	통과 (0.57ms, 82.4MB)
테스트 22 〉	통과 (0.38ms, 81.8MB)
테스트 23 〉	통과 (0.34ms, 75.9MB)
테스트 24 〉	통과 (0.37ms, 77.3MB)
테스트 25 〉	통과 (0.44ms, 77.5MB)
