import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
       
        Arrays.sort(times);
        
        long answer = 0;
        long Start = 0;
        long End = (long) n * times[times.length - 1]; 
        
        while (Start <= End) {
            
            long mid = (Start + End) / 2;
            long sum = 0; 
            
            for (int i = 0; i < times.length; i++) { 
                sum += mid / times[i];
            }
            if (sum < n) { 
                Start = mid + 1;
            } else { 
                End = mid - 1;
                answer = mid;
            }
        }
                
        return answer;
    }
}
