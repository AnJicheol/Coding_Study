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
