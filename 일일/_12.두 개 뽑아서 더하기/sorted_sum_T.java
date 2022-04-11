import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        
        HashSet<Integer> set = new HashSet<>();
 
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                  set.add(numbers[i] + numbers[j]);
            }
        }
        
        Integer[] arr = set.toArray(new Integer[0]);
        int answer[] = new int[set.size()];
        
        for(int i = 0; i < set.size(); i++){
            answer[i] = arr[i];
        }
        
        Arrays.sort(answer);
        return answer;
    }
}

최저 속도 1.17ms  (가장 오래 걸린 시간)
