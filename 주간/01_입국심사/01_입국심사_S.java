import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long start = 0;
        Arrays.sort(times);
        long end = (long) times[times.length-1] * n;
        
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


테스트 1 〉	통과 (0.41ms, 77.3MB)
테스트 2 〉	통과 (0.60ms, 81MB)
테스트 3 〉	통과 (1.69ms, 79MB)
테스트 4 〉	통과 (91.70ms, 86MB)
테스트 5 〉	통과 (84.55ms, 99.2MB)
테스트 6 〉	통과 (66.64ms, 97.7MB)
테스트 7 〉	통과 (97.49ms, 86.3MB)
테스트 8 〉	통과 (101.47ms, 95.3MB)
테스트 9 〉	통과 (0.50ms, 95.9MB)
