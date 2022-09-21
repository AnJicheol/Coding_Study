import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long start = 0;
        long max = 0;
        
        for (int i = 0; i< times.length; i++) {
           if (max < times[i]) max = times[i];
        }
        
        long end = max * n;
        
        //System.out.println(end);
        
        while (start <= end) {
            //System.out.println("start = "+start+ " end = "+end);
            long mid = (end + start)/2;
            long count = 0;
            for (int i = 0; i < times.length; i++) {
                count +=  mid / (long)times[i];
            }
            
            if (count >= n) {
                end = mid - 1;
                answer = mid;
            }
            else start = mid + 1;
        }
        
        return answer;
    }
}

테스트 1 〉	통과 (0.11ms, 73.6MB)
테스트 2 〉	통과 (0.15ms, 88.8MB)
테스트 3 〉	통과 (1.85ms, 75.6MB)
테스트 4 〉	통과 (44.34ms, 80.1MB)
테스트 5 〉	통과 (68.45ms, 94.7MB)
테스트 6 〉	통과 (57.01ms, 78.3MB)
테스트 7 〉	통과 (74.40ms, 98.8MB)
테스트 8 〉	통과 (81.77ms, 93MB)
테스트 9 〉	통과 (0.07ms, 83.6MB)
