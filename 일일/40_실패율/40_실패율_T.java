import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        Integer[] sorted = new Integer[N]; 
        float[] fail   = new float[N + 1];      
        int[] answer   = new int[N];
        int warrior = stages.length;
        
        for(int i = 0; i < N; i++) sorted[i] = i;
        for(int num : stages) fail[num - 1]++; 
        
        for(int i = 0; i < N + 1; i++){
            int tmep = warrior - (int)fail[i];
            
            if(fail[i] == 0) continue;
            fail[i] = fail[i] / warrior;             
            warrior = tmep;
        }
        
        Arrays.sort(sorted, new Comparator<Integer>(){
            @Override public int compare(Integer o1, Integer o2) {
                return Float.compare(fail[o2], fail[o1]);
            }
        });
        for(int i = 0; i < N; i++)answer[i] = sorted[i] + 1;
        
        return answer;
    }
}
