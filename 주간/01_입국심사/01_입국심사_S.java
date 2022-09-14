import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long start = 0;
        Arrays.sort(times);
        long end = times[times.length-1] * n;
        long mid = 0;
        while (start < end) {
            //System.out.println("start = "+start+ " end = "+end);
            mid = (end + start) / 2;
            int count = 0;
            for (int i = 0; i < times.length; i++) {
                count += mid / times[i];
                if (count >= n) break;
            }
            
            if (count > n) end = mid;
            else if (count < n) start = mid;
            else if (count == n) break;
            
        }
        
        return mid;
    }
}
